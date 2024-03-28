package service;

import model.ThongKe;
import java.util.List;

public interface ThongKeService {
    List<ThongKe> getAll();
    List<ThongKe> findByDate(String Date);
}
