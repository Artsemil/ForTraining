package forTraining.queue;

public class ObjectQueue {
    // Указатель на первый элемент
    private ObjectBox head = null;
    // Указатель на последний элемент
    private ObjectBox tail = null;
    // Поле для хранения размера очереди
    private int size;

    public void push(Object obj) {
        // Сразу создаем вспомогательный объект и помещаем новый элемент в него
        ObjectBox ob = new ObjectBox();
        ob.setObject(obj);
        // Если очередь пустая - в ней еще нет элементов
        if (head == null) {
            // Теперь наша голова указывает на наш первый элемент
            head = ob;
        } else {
            // Если это не первый элемент, то надо, чтобы последний элемент в очереди
            // указывал на вновь прибывший элемент
            tail.setNext(ob);
        }
        // И в любом случае нам надо наш "хвост" переместить на новый элемент
        // Если это первый элемент, то "голова" и "хвост" будут указывать на один и тот же элемент
        tail = ob;
        // Увеличиваем размер нашей очереди
        size++;
    }

    public Object pull() {
        if (size == 0) return null;
        Object object = head.getObject();
        head = head.getNext();
        if (head == null) {
            tail = null;
        }
        size--;
        // Возвращаем значение
        return object;
    }

    public int size() {
        return size;
    }

    private class ObjectBox {
        private Object object;
        private ObjectBox next;


        Object getObject() {
            return object;
        }

        void setObject(Object object) {
            this.object = object;
        }

        ObjectBox getNext() {
            return next;
        }

        void setNext(ObjectBox next) {
            this.next = next;
        }
    }
}
