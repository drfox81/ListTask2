public class Main {
    public static void main(String[] args) {
        Human petr= new Human("Петр");
        Human oleg= new Human("Олег");
        Human mihail= new Human("Михаил");
        Human katia= new Human("Катя");
        Human sasha= new Human("Саша");
        Human masha= new Human("Маша");
        Human olia= new Human("Оля");
        Human sveta= new Human("Света");
        Human dima= new Human("Дима");
        Human kostia= new Human("Костя");
        Human ivan= new Human("Иван");

        Queue queue=new Queue<>();

        queue.randomQueueOne();
        queue.randomQueueTwo();

        System.out.println(queue.getQueueOne().size());

        for (int i = 0; i < queue.getQueueOne().size(); i++) {
            System.out.println(queue.getQueueOne().get(i));
        }
        System.out.println(queue.getQueueTwo().size());
        for (int i = 0; i < queue.getQueueTwo().size(); i++) {
            System.out.println(queue.getQueueTwo().get(i));
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");

        queue.addHumanQueue(queue.randomHuman());
        for (int i = 0; i < queue.getQueueOne().size(); i++) {
            System.out.println(queue.getQueueOne().get(i));
        }
        System.out.println(queue.getQueueOne().size());

        for (int i = 0; i < queue.getQueueTwo().size(); i++) {
            System.out.println(queue.getQueueTwo().get(i));
        }
        System.out.println(queue.getQueueTwo().size());
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
        queue.deleteHuman();
        for (int i = 0; i < queue.getQueueOne().size(); i++) {
            System.out.println(queue.getQueueOne().get(i));
        }
        System.out.println(queue.getQueueOne().size());

        for (int i = 0; i < queue.getQueueTwo().size(); i++) {
            System.out.println(queue.getQueueTwo().get(i));
        }
        System.out.println(queue.getQueueTwo().size());
    }

}