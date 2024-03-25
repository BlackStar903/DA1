 use BanGiay_DA1

--ThuongHieu
if object_id('THUONGHIEU') is not null
drop table THUONGHIEU
create table THUONGHIEU
(
	id_thuongHieu int identity(1,1),
	tenThuongHieu nvarchar(50),
	trangThai int, --0 ho?t ð?ng, 1 ng?ng 
	constraint pk_ThuongHieu primary key(id_thuongHieu)
)

SET IDENTITY_INSERT [dbo].THUONGHIEU ON 
INSERT [dbo].THUONGHIEU (id_thuongHieu, tenThuongHieu,trangThai) VALUES (1, N'adidas',0)
INSERT [dbo].THUONGHIEU (id_thuongHieu, tenThuongHieu,trangThai) VALUES (2, N'puma',0)
INSERT [dbo].THUONGHIEU (id_thuongHieu, tenThuongHieu,trangThai) VALUES (3, N'poly',0)
INSERT [dbo].THUONGHIEU (id_thuongHieu, tenThuongHieu,trangThai) VALUES (4, N'nike',0)
SET IDENTITY_INSERT [dbo].THUONGHIEU OFF

--ChatLieu
if object_id('CHATLIEU') is not null
drop table CHATLIEU
create table CHATLIEU
(
	id_chatLieu int identity(1,1),
	tenChatLieu nvarchar(50),
	trangThai int, --0 ho?t ð?ng, 1 ng?ng 
	constraint pk_ChatLieu primary key(id_chatLieu)
)

SET IDENTITY_INSERT [dbo].[chatLieu] ON 
INSERT [dbo].[chatLieu] ([id_chatLieu], [tenChatLieu],trangThai) VALUES (1, N'v?i',0)
INSERT [dbo].[chatLieu] ([id_chatLieu], [tenChatLieu],trangThai) VALUES (2, N'da b?',0)
INSERT [dbo].[chatLieu] ([id_chatLieu], [tenChatLieu],trangThai) VALUES (3, N'cacbon',0)
INSERT [dbo].[chatLieu] ([id_chatLieu], [tenChatLieu],trangThai) VALUES (4, N'l?a',0)
INSERT [dbo].[chatLieu] ([id_chatLieu], [tenChatLieu],trangThai) VALUES (5, N'ninon',0)
SET IDENTITY_INSERT [dbo].[chatLieu] OFF

--NhaCungCap
if object_id('NHACUNGCAP') is not null
drop table NHACUNGCAP
create table NHACUNGCAP
(
	id_nhaCC int identity(1,1),
	tennhaCC nvarchar(50),
	trangThai int, --0 ho?t ð?ng, 1 ng?ng 
	constraint pk_NHACUNGCAP primary key(id_nhaCC)
)
SET IDENTITY_INSERT [dbo].NHACUNGCAP ON 
INSERT [dbo].NHACUNGCAP (id_nhaCC, tennhaCC,trangThai) VALUES (1, N'm?',0)
INSERT [dbo].NHACUNGCAP (id_nhaCC, tennhaCC,trangThai) VALUES (2, N'anh',0)
INSERT [dbo].NHACUNGCAP (id_nhaCC, tennhaCC,trangThai) VALUES (3, N'Pháp',0)
INSERT [dbo].NHACUNGCAP (id_nhaCC, tennhaCC,trangThai) VALUES (4, N'trung qu?c',0)
SET IDENTITY_INSERT [dbo].NHACUNGCAP OFF

--TheLoai
if object_id('THELOAI') is not null
drop table THELOAI
create table THELOAI
(
	id_theLoai int identity(1,1),
	tenTheLoai nvarchar(50),
	trangThai int, --0 ho?t ð?ng, 1 ng?ng 
	constraint pk_THELOAI primary key(id_theLoai)
)
SET IDENTITY_INSERT [dbo].THELOAI ON 
INSERT [dbo].THELOAI (id_theLoai, tenTheLoai,trangThai) VALUES (1, N'ch?y',0)
INSERT [dbo].THELOAI (id_theLoai, tenTheLoai,trangThai) VALUES (2, N'ch?y',0)
INSERT [dbo].THELOAI (id_theLoai, tenTheLoai,trangThai) VALUES (3, N'ch?y',0)
INSERT [dbo].THELOAI (id_theLoai, tenTheLoai,trangThai) VALUES (4, N'ch?y',0)
SET IDENTITY_INSERT [dbo].THELOAI OFF

--SanPham
if object_id('SANPHAM') is not null
drop table SANPHAM
create table SANPHAM
(
	id_sanPham int identity(1,1),
	id_theLoai int,
	id_chatLieu int,
	id_thuongHieu int,
	id_nhaCungCap int,
	tenSanPham nvarchar(50),
	mau nvarchar(50),
	gia money,
	size int,
	soLuong int,
	ghiChu nvarchar(250),
	trangThai int, --0 ho?t ð?ng, 1 ng?ng 
	constraint pk_SanPham primary key(id_sanPham),
	constraint fk_SanPham_TheLoai foreign key(id_theLoai) references theloai,
	constraint fk_SanPham_chatLieu foreign key(id_chatLieu) references chatLieu,
	constraint fk_SanPham_thuongHieu foreign key(id_thuongHieu) references thuongHieu,
	constraint fk_SanPham_nhaCungCap foreign key(id_nhaCungCap) references nhaCungCap,
)
select *  from SANPHAM
SET IDENTITY_INSERT [dbo].SANPHAM ON 
INSERT [dbo].SANPHAM (id_sanPham,id_theLoai,id_chatLieu,id_thuongHieu,id_nhaCungCap, tenSanPham,mau,gia,size,soLuong,ghiChu,trangThai) VALUES (1,1,1,1,1, N'Giày 1',N'Ð?',1000,30,30,'',0)
INSERT [dbo].SANPHAM (id_sanPham,id_theLoai,id_chatLieu,id_thuongHieu,id_nhaCungCap, tenSanPham,mau,gia,size,soLuong,ghiChu,trangThai) VALUES (2,2,2,2,2, N'Giày 2',N'Vàng',1000,40,40,'',0)
INSERT [dbo].SANPHAM (id_sanPham,id_theLoai,id_chatLieu,id_thuongHieu,id_nhaCungCap, tenSanPham,mau,gia,size,soLuong,ghiChu,trangThai) VALUES (3,3,3,3,3, N'Giày 3',N'Tr?ng',1000,50,50,'',0)
INSERT [dbo].SANPHAM (id_sanPham,id_theLoai,id_chatLieu,id_thuongHieu,id_nhaCungCap, tenSanPham,mau,gia,size,soLuong,ghiChu,trangThai) VALUES (4,4,4,4,4, N'Giày 4',N'Ðen',1000,60,60,'',0)
SET IDENTITY_INSERT [dbo].SANPHAM OFF

--taiKhoan
if object_id('TAIKHOAN') is not null
drop table TAIKHOAN
create table TAIKHOAN
(
	id_taiKhoan int identity(1,1),
	tenTaiKhoan nvarchar(50),
	matKhau nvarchar(50),
	vaiTro bit,
	trangThai int, --0 ho?t ð?ng, 1 ng?ng 
	constraint pk_TAIKHOAN primary key(id_taiKhoan)
)
SET IDENTITY_INSERT [dbo].TAIKHOAN ON 
INSERT [dbo].TAIKHOAN (id_taiKhoan, tenTaiKhoan,matKhau,vaiTro,trangThai) VALUES (1, N'hoanAdmin','hoan123',0,0)
INSERT [dbo].TAIKHOAN (id_taiKhoan, tenTaiKhoan,matKhau,vaiTro,trangThai) VALUES (2, N'hoanNhanVien','hoan123',1,0)
INSERT [dbo].TAIKHOAN (id_taiKhoan, tenTaiKhoan,matKhau,vaiTro,trangThai) VALUES (3, N'hoanTest','hoan123',1,0)
SET IDENTITY_INSERT [dbo].TAIKHOAN OFF

--NhanVien
if object_id('NHANVIEN') is not null
drop table NHANVIEN
create table NHANVIEN
(
	id_nhanVien int identity(1,1),
	id_taiKhoan int,
	hoTen nvarchar(50),
	gioiTinh bit, --0 NAM 1 N?
	soDt nvarchar(50),
	diaChi nvarchar(50),
	trangThai int, --0 ho?t ð?ng, 1 ng?ng 
	constraint pk_NHANVIEN primary key(id_taiKhoan),
	constraint fk_NHANVIEN_TAIKHOAN foreign key(id_taiKhoan) references TAIKHOAN
)
SET IDENTITY_INSERT [dbo].NHANVIEN ON 
INSERT [dbo].NHANVIEN (id_nhanVien, id_taiKhoan,hoTen,gioiTinh,soDt,diaChi,trangThai) VALUES (1, 1,N'Hoàn dz',0,'0915836583',N'HÀ N?I',0)
INSERT [dbo].NHANVIEN (id_nhanVien, id_taiKhoan,hoTen,gioiTinh,soDt,diaChi,trangThai) VALUES (2, 2,N'Hoàn NHÂN VIÊN',0,'0915836583',N'HÀ N?I',0)
INSERT [dbo].NHANVIEN (id_nhanVien, id_taiKhoan,hoTen,gioiTinh,soDt,diaChi,trangThai) VALUES (3, 3,N'Hoàn test',0,'0915836583',N'HÀ N?I',0)
SET IDENTITY_INSERT [dbo].NHANVIEN OFF

--khuyenMai
if object_id('KHUYENMAI') is not null
drop table KHUYENMAI
create table KHUYENMAI
(
	id_khuyenMai int identity(1,1),
	tenKhuyenMai nvarchar(50),
	loai nvarchar(50),
	giaTri nvarchar(20),
	ngayBatDau datetime,
	ngayKetThuc datetime,
	trangThai int, --0 ho?t ð?ng, 1 ng?ng 
	constraint pk_KHUYENMAI primary key(id_khuyenMai)
)
SET IDENTITY_INSERT [dbo].KHUYENMAI ON 
INSERT [dbo].KHUYENMAI (id_khuyenMai, tenKhuyenMai,loai,giaTri,ngayBatDau,ngayKetThuc,trangThai) VALUES (1, N'Khuy?n m?i poly','%',20,'2023-10-11','2023-12-09',1)
INSERT [dbo].KHUYENMAI (id_khuyenMai, tenKhuyenMai,loai,giaTri,ngayBatDau,ngayKetThuc,trangThai) VALUES (2, N'Khuy?n m?i d? án 1','%',50,'2023-10-13','2023-11-25',0)
INSERT [dbo].KHUYENMAI (id_khuyenMai, tenKhuyenMai,loai,giaTri,ngayBatDau,ngayKetThuc,trangThai) VALUES (3, N'khuy?n m?i poly2','VNÐ',90000,'2023-10-10','2023-10-31',1)
INSERT [dbo].KHUYENMAI (id_khuyenMai, tenKhuyenMai,loai,giaTri,ngayBatDau,ngayKetThuc,trangThai) VALUES (4, N'khuy?n m?i poly99','VNÐ',11111,'2023-10-10','2023-10-31',1)
SET IDENTITY_INSERT [dbo].KHUYENMAI OFF

--khachHang
if object_id('KHACHHANG') is not null
drop table KHACHHANG
create table KHACHHANG
(
	id_khachHang int identity(1,1),
	hoTen nvarchar(50),
	gioiTinh bit,
	diaChi nvarchar(20),
	soDienThoai nvarchar(15),
	constraint pk_KHACHHANG primary key(id_khachHang)
)
SET IDENTITY_INSERT [dbo].KHACHHANG ON 
INSERT [dbo].KHACHHANG (id_khachHang,hoTen,gioiTinh,diaChi,soDienThoai) VALUES (1,N'Nguy?n Th? A',1,N'Hà N?i',1)
INSERT [dbo].KHACHHANG (id_khachHang,hoTen,gioiTinh,diaChi,soDienThoai) VALUES (2,N'Nguy?n vãn B',0,N'Hà N?i','012345')
INSERT [dbo].KHACHHANG (id_khachHang,hoTen,gioiTinh,diaChi,soDienThoai) VALUES (3,N'Nguy?n Th? C',1,N'Hà N?i','012345')

--HoaDon
if object_id('HOADON') is not null
drop table HOADON
create table HOADON
(
	id_hoaDon int identity(1,1),
	id_sanPham int,
	id_khachHang int,
	id_khuyenMai int,
	soLuong int,
	donGia float,
	ngayTao datetime,
	constraint pk_HOADON primary key(id_hoaDon),
	constraint fk_HOADON_SanPham foreign key(id_sanPham) references sanpham,
	constraint fk_HOADON_khachHang foreign key(id_khachHang) references khachHang,
	constraint fk_HOADON_khuyenMai foreign key(id_khuyenMai) references khuyenMai
)
SET IDENTITY_INSERT [dbo].HOADON ON 
INSERT [dbo].HOADON (id_hoaDon,id_sanPham,id_khachHang,id_khuyenMai,soLuong,donGia,
ngayTao) VALUES (1,1,1,1,2,4000,'2023-10-10')
INSERT [dbo].HOADON (id_hoaDon,id_sanPham,id_khachHang,id_khuyenMai,soLuong,donGia,
ngayTao) VALUES (2,1,1,1,2,4000,'2023-10-11')
INSERT [dbo].HOADON (id_hoaDon,id_sanPham,id_khachHang,id_khuyenMai,soLuong,donGia,
ngayTao) VALUES (3,1,1,1,2,4000,'2023-10-12')
SET IDENTITY_INSERT [dbo].HOADON OFF