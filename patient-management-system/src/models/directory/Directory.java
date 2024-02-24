package models.directory;

import java.util.List;

public abstract class Directory<T> {
    List<T> records = null;
    public boolean add(T record) {
        return records.add(record);
    }
    public boolean delete(T record){
        return records.remove(record);
    }
    public T delete(int index){
        return records.remove(index);
    }
    public List<T> getAll(){
        return records;
    }
}
