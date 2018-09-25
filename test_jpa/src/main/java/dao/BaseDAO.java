package dao;

import java.util.Map;

public interface BaseDAO<T>{
    T save(T o);
    T read(Long id);
    T update(Long id, Map<String, Object> map);
    void delete(Long id);
    void delete(T o);
}
