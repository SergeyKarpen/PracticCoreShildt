package main.java.com.sergeykarpen.javacore.patterns.behavioral.iterator;

public class Tasks implements ConcreteIterator {
    static String[] tasks = {"Проснуться", "Позвонить по работе", "Выгулить собаку"};

    public String[] getTasks() {
        return tasks;
    }

    @Override
    public Iterator getIterator() {
        return new TaskIterator();
    }

    private class TaskIterator implements Iterator {
        int index = 0;

        @Override
        public boolean hasNext() {
            if (index < Tasks.tasks.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object first() {
            return Tasks.tasks[0];
        }

        @Override
        public Object next() {
            return Tasks.tasks[index++];
        }
    }
}
