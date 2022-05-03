package bai_tap_quan_ly_oop.bai_1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class QLCB {
    private List<CanBo> canBos;

    QLCB(){
        this.canBos= new ArrayList<>();
    }
    public void add (CanBo canBo){
        this.canBos.add(canBo);
    }

    public List<CanBo> timKiemTheoTen(String ten){
        return this.canBos.stream().filter(canBo -> canBo.getTen().contains(ten)).collect(Collectors.toList());
    }

    public void hienThi(){
        this.canBos.forEach(canBo -> System.out.println(canBo.toString()));
    }
}
