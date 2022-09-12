package core.basesyntax.dao;

import java.util.Map;

public interface StorageDao {
    void updateDataStorage(String descriptionOfGoods, Integer quantity);

    Integer getRemainingGoods(String descriptionOfGoods);

    Map<String, Integer> getAllData();
}