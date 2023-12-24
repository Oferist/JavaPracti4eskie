package pr13;

import java.io.*;


public class FileManipulation {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("\nВыберите действие:");
            System.out.println("1. Запись в файл");
            System.out.println("2. Вывод информации из файла");
            System.out.println("3. Замена информации в файле (только английские буквы + числа)");
            System.out.println("4. Добавление информации в конец файла");
            System.out.println("5. Выход");

            try {
                int choice = Integer.parseInt(reader.readLine());

                switch (choice) {
                    case 1:
                        writeToFile(reader);
                        break;
                    case 2:
                        readFromFile();
                        break;
                    case 3:
                        replaceInFile(reader);
                        break;
                    case 4:
                        appendToFile(reader);
                        break;
                    case 5:
                        System.out.println("Выход из программы.");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Некорректный выбор. Попробуйте снова.");
                }
            } catch (NumberFormatException | IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void writeToFile(BufferedReader reader) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("file.txt"))) {
            System.out.println("Введите информацию для записи в файл:");
            String input = reader.readLine();
            writer.write(input);
            System.out.println("Информация успешно записана в файл.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader("file.txt"))) {
            System.out.println("Содержимое файла:");
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void replaceInFile(BufferedReader reader) {
        try (BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream("file.txt"), "UTF-8"));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("temp.txt"), "UTF-8"))) {

            System.out.println("Введите новую информацию для замены в файле:");
            String replacement = reader.readLine();

            // Читаем старую информацию из файла и заменяем ее
            String line;
            while ((line = fileReader.readLine()) != null) {
                writer.write(line.replaceFirst(".*", replacement));
                writer.newLine();
            }

            System.out.println("Информация успешно заменена в файле.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Перезаписываем содержимое временного файла в исходный файл
        File originalFile = new File("file.txt");
        File tempFile = new File("temp.txt");

        try (RandomAccessFile rafOriginal = new RandomAccessFile(originalFile, "rw");
             BufferedReader tempReader = new BufferedReader(new InputStreamReader(new FileInputStream(tempFile), "UTF-8"))) {

            // Очищаем исходный файл
            rafOriginal.setLength(0);

            // Переписываем содержимое временного файла в исходный файл
            String line;
            while ((line = tempReader.readLine()) != null) {
                rafOriginal.writeBytes(line + System.lineSeparator());
            }

            System.out.println("Файл успешно обновлен.");

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Не удалось обновить файл.");
        }
    }
    
    
    private static void appendToFile(BufferedReader reader) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("file.txt", true))) {
            System.out.println("Введите текст для добавления в конец файла:");
            String input = reader.readLine();
            writer.write(input);
            writer.newLine();
            System.out.println("Текст успешно добавлен в конец файла.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
