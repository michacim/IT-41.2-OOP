package phonebook;

public interface Phonebook {


    /**
     * check name if not contains in map
     * @param name v
     * @param number eg. 01777324242
     * @return true, if name and number saved
     */
    boolean save (String name, String number);

    /**
     *
     * @param name eg. Max Meier (Key)
     * @return true, if successful
     */
    boolean delete(String name);

    /**
     *
     * @param name
     * @param number
     * @return true, if successful
     */
    boolean update(String name, String number);

    /**
     *
     * @param name
     * @return Number if Present, or ""
     */
    String findNumber(String name);


    /**
     * System.out.print all Phonebook-Entries
     */
    void printAll();


}
