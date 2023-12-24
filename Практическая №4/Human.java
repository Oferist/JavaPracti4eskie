package pr4;

class Human {
    class Head {
        private String hairColor;

        public Head(String hairColor) {
            this.hairColor = hairColor;
        }

        public String getHairColor() {
            return hairColor;
        }
    }

    class Leg {
        private int size;

        public Leg(int size) {
            this.size = size;
        }

        public int getSize() {
            return size;
        }
    }

    class Hand {
        private boolean isWaving;

        public Hand() {
            this.isWaving = false;
        }

        public boolean isWaving() {
            return isWaving;
        }

        public void wave() {
            isWaving = true;
        }
    }

    private Head head;
    private Leg leftLeg;
    private Leg rightLeg;
    private Hand leftHand;
    private Hand rightHand;

    public Human(String hairColor, int leftLegSize, int rightLegSize) {
        this.head = new Head(hairColor);
        this.leftLeg = new Leg(leftLegSize);
        this.rightLeg = new Leg(rightLegSize);
        this.leftHand = new Hand();
        this.rightHand = new Hand();
    }

    public Head getHead() {
        return head;
    }

    public Leg getLeftLeg() {
        return leftLeg;
    }

    public Leg getRightLeg() {
        return rightLeg;
    }

    public Hand getLeftHand() {
        return leftHand;
    }

    public Hand getRightHand() {
        return rightHand;
    }
}