package phonebook;

import java.util.HashMap;

/**
 * Aufgabe: implementiere die Methoden
 */
public class PhonebookImpl implements Phonebook{
    private HashMap<String,String> phoneMap = new HashMap<>();

    /**
     * check name if not contains in map
     *
     * @param name   v
     * @param number eg. 01777324242
     * @return true, if name and number saved
     */
    @Override
    public boolean save(String name, String number) {
        //check Parameter
        //check name if not contains in map

        if (name == null || name.isBlank() || number == null || number.isBlank()){
            return false;
        }
        if(phoneMap.containsKey(name)){
            return false;
        }
        phoneMap.put(name,number);  // return putIfAbsent(name,number) == null

        return true;
    }

    /**
     *
     * @param name eg. Max Meier (Key)
     * @return true, if successful
     */
    @Override
    public boolean delete(String name) {
        if (name == null || name.isBlank()){
            return false;
        }
        if(!phoneMap.containsKey(name)){
            return false;
        }
        phoneMap.remove(name);
        return true;

    }

    /**
     *
     * @param name
     * @param number
     * @return true, if successful
     */
    @Override
    public boolean update(String name, String number) {
        if (name == null || name.isBlank() || number == null || number.isBlank()){
            return false;
        }
        if(phoneMap.containsKey(name)){
            return false;
        }
        phoneMap.replace(name,number);
        return true;

    }

    /**
     *
     * @param name
     * @return Number if Present, or null
     */
    @Override
    public String findNumber(String name) {
        if (name == null || name.isBlank()){
            return null;
        }
        return phoneMap.get(name);
    }

    /**
     * System.out.print all Phonebook-Entries
     */
    @Override
    public void printAll() {
        System.out.println(phoneMap);
    }

    public HashMap<String, String> getPhoneMap() {
        return phoneMap;
    }
}
