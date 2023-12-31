package S06.model_block;

public class Model {

    private int id; // переменная для счетчика id

    private UserDB userdb; // создание базы данных

    /**
     * Конструктор модели, создающий базу данных и задающий начальное значение id
     */
    public Model() {
        userdb = new UserDB();
        id = 1;
    }


    /**
     * Метод модели, сохраняющий базу по пути path
     * @param path - путь для сохранения базы данных
     */
    public void saveDb(String path) {
        Loader<UserDB> loader = new Loader<>();
        loader.write(path, userdb);
    }

    /**
     * Метод модели, позволяющий загрузить базу данных, по переданному пути
     * @param path - путь сохранения
     * @return - возвращает базу данных
     */

    public UserDB loadDb(String path) {
        Loader<UserDB> loader = new Loader<>();
        return userdb = (UserDB) loader.read(path);
    }

    /**
     * Метод модели, реализующий добавления в базу данных
     * @param username - Имя пользователя
     * @param password - Пароль пользователя
     * @param email - email пользователя
     */

    public void addUser(String name,String username, String password, String email) {
        userdb.addUser(new User (++id, name, username, password, email));
    }

    /**
     * Метод модели, реализующий удаление пользователя по заданным параметрам
     */

    public void removeUser(String search) {
        userdb.removeUser(search);
    }

    /**
     * Метод модели реализующий поиск по id
     *
     * @param id - возвращает id
     */

    public void searchUser(int id) {
        userdb.findUser(id);
    }

    /**
     * Перезагрузка метода модели, реализующий поиск по строке
     *
     * @param search - возвращает поиск
     */
    public void searchUser(String search) {
        userdb.findUser(search);
    }

    /**
     * Метод модели, печатающий всех пользователей в БД
     */
    public void printAllUsers() {
        userdb.printAllUsers();
    }
}