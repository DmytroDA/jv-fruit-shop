package core.basesyntax.service;

import java.util.List;

public interface ImportDataService {
    List<String> ReaderFromCsvFile(String path);
}
