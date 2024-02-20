package models.directory;

import java.util.List;

public abstract class Directory<T> {
    List<T> records = null;
    boolean add(T record) {
        return records.add(record);
    }
    boolean delete(T record){
        return records.remove(record);
    }
    T delete(int index){
        return records.remove(index);
    }
    List<T> getAll(){
        return records;
    }
}
