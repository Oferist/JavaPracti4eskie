package pr15_z3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

// Класс, представляющий модель данных - модель списка задач 
public class TaskModel implements TableModel { 
	// Поля класса - список слушателей и список задач 
	private List<TableModelListener> listeners; 
	private List<Task> tasks;
	
	// Конструктор класса
	public TaskModel() {
	    // Инициализируем список слушателей и список задач
	    listeners = new ArrayList<>();
	    tasks = new ArrayList<>();
	}

	// Метод, добавляющий новую задачу в список
	public void addTask(Task task) {
	    // Добавляем задачу в список
	    tasks.add(task);
	    // Оповещаем слушателей об изменении модели
	    fireTableRowsInserted(tasks.size() - 1, tasks.size() - 1);
	}

	// Метод, удаляющий задачу из списка по индексу
	public void deleteTask(int index) {
	    // Удаляем задачу из списка
	    tasks.remove(index);
	    // Оповещаем слушателей об изменении модели
	    fireTableRowsDeleted(index, index);
	}

	// Метод, возвращающий задачу из списка по индексу
	public Task getTask(int index) {
	    // Возвращаем задачу из списка
	    return tasks.get(index);
	}

	// Метод, оповещающий слушателей об изменении модели
	private void fireTableRowsInserted(int firstRow, int lastRow) {
	    // Создаем событие об изменении модели
	    TableModelEvent event = new TableModelEvent(this, firstRow, lastRow, TableModelEvent.ALL_COLUMNS, TableModelEvent.INSERT);
	    // Перебираем всех слушателей
	    for (TableModelListener listener : listeners) {
	        // Уведомляем слушателя о событии
	        listener.tableChanged(event);
	    }
	}

	// Метод, оповещающий слушателей об изменении модели
	private void fireTableRowsDeleted(int firstRow, int lastRow) {
	    // Создаем событие об изменении модели
	    TableModelEvent event = new TableModelEvent(this, firstRow, lastRow, TableModelEvent.ALL_COLUMNS, TableModelEvent.DELETE);
	    // Перебираем всех слушателей
	    for (TableModelListener listener : listeners) {
	        // Уведомляем слушателя о событии
	        listener.tableChanged(event);
	    }
	}

	// Метод, оповещающий слушателей об изменении модели
	private void fireTableRowsUpdated(int firstRow, int lastRow) {
	    // Создаем событие об изменении модели
	    TableModelEvent event = new TableModelEvent(this, firstRow, lastRow, TableModelEvent.ALL_COLUMNS, TableModelEvent.UPDATE);
	    // Перебираем всех слушателей
	    for (TableModelListener listener : listeners) {
	        // Уведомляем слушателя о событии
	        listener.tableChanged(event);
	    }
	}

	// Метод, возвращающий количество строк в модели
	@Override
	public int getRowCount() {
	    // Возвращаем размер списка задач
	    return tasks.size();
	}

	// Метод, возвращающий количество столбцов в модели
	@Override
	public int getColumnCount() {
	    // Возвращаем количество полей в классе Task
	    return 4;
	}

	// Метод, возвращающий значение в ячейке модели по индексам строки и столбца
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
	    // Получаем задачу из списка по индексу строки
	    Task task = tasks.get(rowIndex);
	    // Возвращаем значение в зависимости от индекса столбца
	    switch (columnIndex) {
	        case 0: // Название задачи
	            return task.getName();
	        case 1: // Описание задачи
	            return task.getDescription();
	        case 2: // Срок задачи
	            return task.getDeadline();
	        case 3: // Статус задачи
	            return task.isDone();
	        default: // Недопустимый индекс
	            return null;
	    }
	}

	// Метод, возвращающий название столбца в модели по индексу
	@Override
	public String getColumnName(int columnIndex) {
	    // Возвращаем название в зависимости от индекса столбца
	    switch (columnIndex) {
	        case 0: // Название задачи
	            return "Name";
	        case 1: // Описание задачи
	            return "Description";
	        case 2: // Срок задачи
	            return "Deadline";
	        case 3: // Статус задачи
	            return "Done";
	        default: // Недопустимый индекс
	            return null;
	    }
	}

	// Метод, возвращающий класс столбца в модели по индексу
	@Override
	public Class<?> getColumnClass(int columnIndex) {
	    // Возвращаем класс в зависимости от индекса столбца
	    switch (columnIndex) {
	        case 0: // Название задачи
	            return String.class;
	        case 1: // Описание задачи
	            return String.class;
	        case 2: // Срок задачи
	            return LocalDate.class;
	        case 3: // Статус задачи
	            return Boolean.class;
	        default: // Недопустимый индекс
	            return null;
	    }
	}

	// Метод, возвращающий признак, можно ли редактировать ячейку модели по индексам строки и столбца
	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
	    // Возвращаем false, так как редактирование ячеек не поддерживается
	    return false;
	}

	// Метод, устанавливающий значение в ячейке модели по индексам строки и столбца
	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
	    // Ничего не делаем, так как редактирование ячеек не поддерживается
	}

	// Метод, добавляющий слушателя изменений модели
	@Override
	public void addTableModelListener(TableModelListener l) {
	    // Добавляем слушателя в список
	    listeners.add(l);
	}

	// Метод, удаляющий слушателя изменений модели
	@Override
	public void removeTableModelListener(TableModelListener l) {
	    // Удаляем слушателя из списка
	    listeners.remove(l);
	}

}
