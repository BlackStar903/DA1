package service;

import model.TheLoai;
import java.util.List;

public interface TheLoaiService {
    List<TheLoai> getTheLoai();
    public boolean add(TheLoai tl);
}
