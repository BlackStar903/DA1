package Servic;

import Model.SanPham;
import java.util.List;

public interface SanPhamService {
    List<SanPhamCt> getAll();
    public boolean add(SanPham sp);

}
