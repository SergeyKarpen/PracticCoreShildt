package main.java.com.sergeykarpen.javacore.patterns.behavioral.iterator;

public class TaskIterator implements Iterator {
    int index = 0;

    @Override
    public boolean hasNext() {
        if (index < Tasks.tasks.length) {
            return true;
        }
        return  false;
    }
        @Override
        public Object first () {
            return Tasks.tasks[index];
        }

        @Override
        public Object next () {
            return Tasks.tasks[index++];
        }
    }
