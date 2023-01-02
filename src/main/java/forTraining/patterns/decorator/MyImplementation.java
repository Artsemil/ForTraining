package forTraining.patterns.decorator;

public class MyImplementation {
    public static void main(String[] args) {
        IWrite write = new Write();
        IWrite writeWithPunktir = new WritePunktir(new WriteDecorator(write));
        writeWithPunktir.write();
    }
}

interface IWrite {
    void write();
}

class Write implements IWrite {
    @Override
    public void write() {
        System.out.println("Primitive message");
    }
}

class WriteDecorator implements IWrite {

    private IWrite iwriteInstatnce;
    WriteDecorator(IWrite iwriteInstatnce) {
        this.iwriteInstatnce = iwriteInstatnce;
    }

    @Override
    public void write() {
        iwriteInstatnce.write();
    }
}

class WritePunktir extends WriteDecorator{

    WritePunktir(IWrite iwriteInstatnce) {
        super(iwriteInstatnce);
    }

    @Override
    public void write() {
        System.out.println("------------");
        super.write();
    }
}