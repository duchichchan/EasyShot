/**
 * Основной класс сервера EasyShot.
 * TODO:
 * + Прослушка порта
 * + Получение изображения
 * + Сохранение на диск
 * + Отдача адреса на скриншот
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
		// Запуск прослушки порта
		Reader reader = new Reader(settings.getPort(), settings.getImagePath(), settings.getIP());
		reader.start();
	}

}
