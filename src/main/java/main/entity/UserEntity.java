package main.entity;

import javax.persistence.*;

@Entity
@Table(name = "NguoiDung")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Ho")
    private String ho;

    @Column(name = "Ten")
    private String ten;

    @Column(name = "Email")
    private String email;

    @Column(name = "Matkhau")
    private String matkhau;

    @Column(name = "Sodienthoai")
    private String sodienthoai;

    @Column(name = "Diachi")
    private String diachi;

}
