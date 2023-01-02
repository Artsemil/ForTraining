package forTraining.stack;

public class ObjectStack {
    private ObjectBox head = null;
    private ObjectBox prev = null;
    private int size;

    public void push(Object obj) {
        ObjectBox ob = new ObjectBox();
        ob.setObject(obj);
        if (head == null) {
            prev = ob;
        } else {
            ob.setPrev(prev);
        }
        head = ob;
        prev = ob;
        size++;
    }

    public Object pull() {
        if (size == 0) return null;
        Object object = head.getObject();
        head = head.getPrev();
        if (head == null) {
            prev = null;
        }
        size--;
        return object;
    }

    public int size() {
        return size;
    }

    private class ObjectBox {
        private Object object;
        private ObjectBox prev;

        Object getObject() {
            return object;
        }

        void setObject(Object object) {
            this.object = object;
        }

        ObjectBox getPrev() {
            return prev;
        }

        void setPrev(ObjectBox prev) {
            this.prev = prev;
        }
    }
}
