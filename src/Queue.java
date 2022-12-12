import java.util.ArrayList;
import java.util.Objects;

public class Queue<H extends Human> {
    private ArrayList<Human> queueOne = new ArrayList<>(5);
    private ArrayList<Human> queueTwo = new ArrayList<>(5);
    private H h;

    public Queue() {
        this.queueOne = queueOne;
        this.queueTwo = queueTwo;
    }

    public ArrayList<Human> getQueueOne() {
        return queueOne;
    }

    public ArrayList<Human> getQueueTwo() {
        return queueTwo;
    }

    //удаление из очереди
    public void deleteHuman() {
        int randomNumber = (int) (Math.random());
        switch (randomNumber) {
            case 0:
                getQueueOne().remove(0);
                break;
            case 1:
                getQueueTwo().remove(0);
                break;
        }

    }

    //выбор случайного человека из списка людей(од ин и тот же персонаж не может стоять в разных очередях)
    public Human randomHuman() {
        int randomNumber = (int) (Math.random() * H.getListHuman().size());
        for (int i = 0; i < H.getListHuman().size(); i++) {
            if (!getQueueOne().contains(H.getListHuman().get(i)) &&
                    !getQueueTwo().contains(H.getListHuman().get(i))) {
                return H.getListHuman().get(i);
            }
        }
        return null;
    }

    //добавляем в очередь человека
    public void addHumanQueue(H human) {
        if (getQueueOne().size() == 5 && getQueueTwo().size() == 5) {
            System.out.println("Позовите Галю на третью кассу");
        } else if (getQueueOne().size() > getQueueTwo().size()) {
            getQueueTwo().add(human);
        } else {
            getQueueOne().add(human);
        }
    }


    //создаем первую очередь
    public void randomQueueOne() {
        int numberOne = (int) (Math.random() * 4);
        for (int i = 0; i < numberOne; i++) {
            int numberTwo = (int) (Math.random() * H.getListHuman().size());
            if (getQueueTwo().size() < 5) {
                if (!getQueueOne().contains(H.getListHuman().get(numberOne))) {
                    getQueueOne().add(H.getListHuman().get(numberTwo));
                } else {
                    i--;
                }
            }
        }
    }

    //создаем вотрую очередь
    public void randomQueueTwo() {
        int numberOne = (int) (Math.random() * 4);
        for (int i = 0; i < numberOne; i++) {
            int numberTwo = (int) (Math.random() * H.getListHuman().size());
            if (getQueueTwo().size() < 5) {
                if (!getQueueOne().contains(H.getListHuman().get(numberTwo))
                        && !getQueueTwo().contains(H.getListHuman().get(numberTwo))) {
                    getQueueTwo().add(H.getListHuman().get(numberTwo));
                } else {
                    i--;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Queue{" +
                "queueOne=" + queueOne +
                ", queueTwo=" + queueTwo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Queue<?> queue = (Queue<?>) o;
        return Objects.equals(h, queue.h);
    }

    @Override
    public int hashCode() {
        return Objects.hash(h);
    }
}
