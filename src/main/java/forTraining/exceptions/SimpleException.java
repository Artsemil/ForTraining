package forTraining.exceptions;

public class SimpleException extends Exception{

    private int errorCode;

//    // переопределяем конструктор
//    public SimpleException(String message)
//    {
//        this(0, message);
//    }

    // Создаем свой конструктор
    public SimpleException(int errorCode, String message)
    {
        // Вызываем конструктор предка
        super(message);
        // Добавляем инициализацию своего поля
        this.errorCode = errorCode;
    }

    // Метод для получения кода ошибки
    public int getErrorCode()
    {
        return errorCode;
    }
}
