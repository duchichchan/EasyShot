/**
 * Основной класс клиента EasyShot.
 * На данный момент консольный.
 * TODO: Получение адреса на файл
 * 
 * @author Taneong
 *
 */

public class Main {

	/**
	 * @param args Аргументы при запуске
	 */
	public static void main(String[] args) {
		// Приветствие
		System.out.println("EasyShot");
		// Чтение настроек
		Settings settings = new Settings();
		// Получение скриншота
		ScreenShot screenShot = new ScreenShot();
		// Отправка скриншота
		Sender sender = new Sender(settings.getIP(), settings.getPort(), screenShot);
		sender.Send();
	}

}
