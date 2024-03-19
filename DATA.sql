CREATE  DATABASE SuperStarSportSneakers
GO
USE SuperStarSportSneakers
GO
select * from NHANVIEN

IF OBJECT_ID('THUONGHIEU') IS NOT NULL
	DROP TABLE THUONGHIEU
CREATE TABLE THUONGHIEU 
(
	 ID BIGINT IDENTITY (1,1) NOT NULL,
	 MaThuongHieu VARCHAR(15)  NOT NULL ,
	 TenThuongHieu NVARCHAR(50) NOT NULL,
	 TrangThai INT DEFAULT 0 NOT NULL ,
	 -- 0 ĐANG HỢP TÁC , 1 NGỪNG HỢP TÁC
	 CONSTRAINT PK_THUONGHIEU PRIMARY KEY (ID)
)

-- THEM THUONG HIEU
INSERT INTO THUONGHIEU (MaThuongHieu, TenThuongHieu)
VALUES 
('TH001', 'Nike'),
('TH002', 'Adidas'),
('TH003', 'Converse'),
('TH004', 'Vans'),
('TH005', 'Puma');
SELECT * FROM THUONGHIEU

--NhanHieu
--IF OBJECT_ID('NHANHIEU') IS NOT NULL
--	DROP TABLE NHANHIEU
--CREATE TABLE NHANHIEU 
--(
--	 ID BIGINT IDENTITY (1,1) NOT NULL,
--	 MaNhanHieu VARCHAR(15)  NOT NULL ,
--	 TenNhanHieu NVARCHAR(50) NOT NULL,
--	 TrangThai INT DEFAULT 0 NOT NULL ,
--	 -- 0 ĐANG HỢP TÁC , 1 NGỪNG HỢP TÁC
--	 CONSTRAINT PK_NHANHIEU PRIMARY KEY (ID)
--)

--INSERT INTO THUONGHIEU (MaThuongHieu, TenThuongHieu)
--VALUES 
--('NH001', 'Nike'),
--('NH002', 'Adidas'),
--('NH003', 'Converse'),
--('NH004', 'Vans'),
--('NH005', 'Puma');

--- MAU
IF OBJECT_ID('MAU') IS NOT NULL
	DROP TABLE MAU
CREATE TABLE MAU 
(
	 ID BIGINT IDENTITY (1,1) NOT NULL,
	 MaMau VARCHAR(15)  NOT NULL ,
	 TenMau NVARCHAR(50) NOT NULL,
     TrangThai INT DEFAULT 0 NOT NULL , -- 0 CÒN DÙNG , 1 KHÔNG DÙNG
	 CONSTRAINT PK_MAU PRIMARY KEY (ID)
)

INSERT INTO MAU (MaMau, TenMau )
VALUES 
('MAU0001', N'Đỏ'),
('MAU0002', N'Xanh'),
('MAU0003', N'Trắng'),
('MAU0004', N'Vàng'),
('MAU0005', N'Đen');

--- SIZE 
IF OBJECT_ID('SIZE') IS NOT NULL
	DROP TABLE SIZE
CREATE TABLE SIZE 
(
	ID BIGINT IDENTITY (1,1) NOT NULL,
	MaSize VARCHAR(15)  NOT NULL ,
	TenSize DECIMAL(3, 1) NOT NULL,
    TrangThai INT DEFAULT 0 NOT NULL
	-- 0 CÒN DÙNG , 1 KHÔNG DÙNG
	CONSTRAINT PK_SIZE PRIMARY KEY (ID)
)

-- them SIZE
INSERT INTO SIZE (MaSize, TenSize)
VALUES 
('KT001', 34.5),
('KT002', 35),
('KT003', 35.5),
('KT004', 36),
('KT005', 36.5),
('KT006', 37),
('KT007', 37.5),
('KT008', 38),
('KT009', 38.5),
('KT010', 39);

--- ChatLieu
IF OBJECT_ID('CHATLIEU') IS NOT NULL
	DROP TABLE CHATLIEU
CREATE TABLE CHATLIEU 
(
	 ID BIGINT IDENTITY (1,1) NOT NULL,
	 MaChatLieu VARCHAR(15)  NOT NULL ,
	 TenChatLieu NVARCHAR(50) NOT NULL,
     TrangThai INT DEFAULT 0 NOT NULL , -- 0 CÒN DÙNG , 1 KHÔNG DÙNG
	 CONSTRAINT PK_CHATLIEU PRIMARY KEY (ID)
)

INSERT INTO CHATLIEU (MaChatLieu, TenChatLieu) VALUES 
('CL001',  N'Da'),
('CL002',  N'Vải'),
('CL003',  N'Da'),
('CL004',  N'Vải'),
('CL005',  N'Da'),
('CL006',  N'Vải'),
('CL007',  N'Da'),
('CL008',  N'Vải'),
('CL009',  N'Da'),
('CL010',  N'Da');

--DeGiay
IF OBJECT_ID('DEGIAY') IS NOT NULL
	DROP TABLE DEGIAY
CREATE TABLE DEGIAY 
(
	 ID BIGINT IDENTITY (1,1) NOT NULL,
	 MaDeGiay VARCHAR(15)  NOT NULL ,
	 TenDeGiay NVARCHAR(50) NOT NULL,
     TrangThai INT DEFAULT 0 NOT NULL , -- 0 CÒN DÙNG , 1 KHÔNG DÙNG
	 CONSTRAINT PK_DEGIAY PRIMARY KEY (ID)
)

INSERT INTO DEGIAY (MaDeGiay, TenDeGiay)
VALUES 
('DG001', N'Đế da'),
('DG002', N'Đế cao su'),
('DG003', N'Đế da'),
('DG004', N'Đế cao su'),
('DG005', N'Đế da'),
('DG006', N'Đế cao su'),
('DG007', N'Đế da'),
('DG008', N'Đế cao su'),
('DG009', N'Đế da'),
('DG010', N'Đế da');

-- ChucVu
IF OBJECT_ID('CHUCVU') IS NOT NULL
	DROP TABLE CHUCVU
CREATE TABLE CHUCVU 
(
	 ID BIGINT IDENTITY (1,1) NOT NULL,
	 ChucVu NVARCHAR(50)  NOT NULL ,
     TrangThai INT DEFAULT 0 NOT NULL , -- 0 CÒN Làm , 1 KHÔNG làm
	 CONSTRAINT PK_CHUCVU PRIMARY KEY (ID)
)

INSERT INTO CHUCVU (ChucVu,TrangThai)
VALUES 
	(N'Quản Lý',1),
	(N'Nhân viên',1),
	(N'Nhân viên',1),
	(N'Nhân viên',1),
	(N'Nhân viên',1),
	(N'Nhân viên',1),
	(N'Nhân viên',1),
	(N'Nhân viên',1),
	(N'Nhân viên',1),
	(N'Nhân viên',1)


--- NHAN VIEN
IF OBJECT_ID('NHANVIEN') IS NOT NULL
	DROP TABLE NHANVIEN
CREATE TABLE NHANVIEN 
(
	ID BIGINT IDENTITY (1,1) NOT NULL,
	IDChucVu BIGINT null,
	MaNhanVien VARCHAR(10)  NULL,
	HoVaTen NVARCHAR(50) NULL,
	MatKhau VARCHAR(10) NULL,
	NgaySinh DATE NULL,
	GioiTinh nvarchar(15) null,
	CCCD VARCHAR(12) NULL ,
	Email VARCHAR(50) NULL,
	DiaChi NVARCHAR(100) NULL,
	SDT VARCHAR(15) NULL,
	VaiTro BIT  DEFAULT 0 ,
	--- 0 NHÂN VIÊN , 1 LÀ QUẢN LÍ
	NgayTao DATE DEFAULT GETDATE(),
	TrangThai BIT DEFAULT 1 , -- 0 ĐÃ NGHỈ 1 ĐANG LÀM
	CONSTRAINT PK_NHANVIEN PRIMARY KEY (ID),
	constraint fk_nhanvien_chucvu foreign key(idchucvu) references chucvu
)

select * from CHUCVU
--- THEM NHAN VIEN
-- Thêm 10 nhân viên vào NHANVIEN
INSERT INTO NHANVIEN (IDChucVu,MaNhanVien, HoVaTen, MatKhau, NgaySinh, CCCD, Email, DiaChi, SDT, VaiTro, NgayTao, TrangThai)
VALUES 
(1,'NV001', N'Nguyễn Văn A', 'pass123', '1990-01-15', '123456789012', 'nva@example.com', N'123 Đường ABC, Quận XYZ', '0901234567', 0, GETDATE(), 1),
(2,'NV002', N'Trần Thị B', 'pass456', '1995-05-20', '234567890123', 'ttb@example.com', N'456 Đường DEF, Quận LMN', '0912345678', 0, GETDATE(), 1),
(3,'NV003', N'Phạm Văn C', 'pass789', '1988-08-10', '345678901234', 'pvc@example.com', N'789 Đường GHI, Quận OPQ', '0923456789', 0, GETDATE(), 1),
(4,'NV004', N'Lê Thị D', 'passABC', '1992-12-25', '456789012345', 'ltd@example.com', N'101 Đường JKL, Quận RST', '0934567890', 0, GETDATE(), 1),
(5,'NV005', N'Ngô Văn E', 'passDEF', '1985-04-30', '567890123456', 'nve@example.com', N'202 Đường UVW, Quận XYZ', '0945678901', 0, GETDATE(), 1),
(6,'NV006', N'Lý Thị F', 'passGHI', '1998-07-05', '678901234567', 'ltf@example.com', N'303 Đường LMN, Quận OPQ', '0956789012', 0, GETDATE(), 1),
(7,'NV007', N'Nguyễn Văn Mạnh', 'passLMN', '1980-11-12', '789012345678', 'hvm@example.com', N'404 Đường OPQ, Quận RST', '0967890123', 1, GETDATE(), 1),
(8,'NV008', N'Tạ Bá Hòa', 'passOPQ', '1983-09-18', '890123456789', 'tbh@example.com', N'505 Đường RST, Quận UVW', '0978901234', 1, GETDATE(), 1),
(9,'NV009', N'Trương Văn I', 'passRST', '1993-03-08', '901234567890', 'tvi@example.com', N'606 Đường XYZ, Quận ABC', '0989012345', 0, GETDATE(), 1),
(10,'NV010', N'Vũ Thị K', 'passUVW', '1996-06-22', '012345678901', 'vtk@example.com', N'707 Đường ABC, Quận DEF', '0990123456', 0, GETDATE(), 1);

SELECT * FROM NHANVIEN


-------------------------------------------------------------------------------------------------


--- SAN PHAM
IF OBJECT_ID('SANPHAM') IS NOT NULL
	DROP TABLE SANPHAM
CREATE TABLE SANPHAM 
(
	ID BIGINT IDENTITY (1,1) NOT NULL,
	IdSP BIGINT NOT NULL ,
	IdThuongHieu BIGINT NOT NULL,
	IdMau BIGINT NOT NULL,
	IdSize BIGINT NOT NULL,
	IdDeGiay BIGINT NOT NULL,
	IdChatLieu BIGINT NOT NULL,
	--QR VARCHAR(100) NULL,
	MaCTSP VARCHAR(15) NOT NULL,
	SoLuongTon INT NOT NULL ,
	GiaNiemYet MONEY NOT NULL , 
	-- ÁNH XẠ JAVA => BigDecimal
	GiaBan MONEY NOT NULL,
	MoTa NVARCHAR (250) NOT NULL ,
	NgayTao DATE DEFAULT GETDATE(),
	TrangThai INT NOT NULL DEFAULT 0 , -- 0 CÒN HÀNG , 1 TẠM HẾT , 2 DỪNG BÁN
	CONSTRAINT PK_CHI_TIET_SAN_PHAM PRIMARY KEY (ID),
	CONSTRAINT FK_CHI_TIET_SAN_PHAM_THUONGHIEU FOREIGN KEY (IdThuongHieu) REFERENCES THUONGHIEU (ID),
	CONSTRAINT FK_CHI_TIET_SAN_PHAM_MAU FOREIGN KEY (IdMau) REFERENCES MAU (ID),
	CONSTRAINT FK_CHI_TIET_SAN_PHAM_SIZE FOREIGN KEY (IdSize) REFERENCES SIZE (ID),
	CONSTRAINT FK_CHI_TIET_SAN_PHAM_DeGiay FOREIGN KEY (IdDeGiay) REFERENCES DeGiay (ID),
	CONSTRAINT FK_CHI_TIET_SAN_PHAM_ChatLieu FOREIGN KEY (IdChatLieu) REFERENCES ChatLieu (ID),
)

--- THEM SANPHAM
SELECT * FROM SANPHAM;

INSERT INTO SANPHAM (IdSP, IdThuongHieu, IdMau, IdSize, IdDeGiay,IdChatLieu,MaCTSP, SoLuongTon, GiaNiemYet, GiaBan, MoTa, NgayTao, TrangThai)
VALUES 
(1, 1, 1, 1,1,1, 'CTSP0001', 50, 1200000.00, 1200000.00, N'Mô tả CTSP', GETDATE(), 0),
(2, 2, 2,2,2, 2, 'CTSP0002', 30, 1100000.00, 1100000.00, N'Mô tả CTSP', GETDATE(), 0),
(3, 3, 3, 3,3,3, 'CTSP0003', 20, 1000000.00, 1000000.00, N'Mô tả CTSP', GETDATE(), 0),
(4, 4, 4, 4,4,4, 'CTSP0004', 25, 1050000.00, 1050000.00, N'Mô tả CTSP', GETDATE(), 0),
(5, 5, 5, 5, 5, 5, 'CTSP0005', 40, 1150000.00, 1150000.00, N'Mô tả CTSP', GETDATE(), 0),
(5, 1, 2, 3,3,3, 'CTSP0006', 55, 1300000.00, 1300000.00, N'Mô tả CTSP', GETDATE(), 0),
(4, 2, 3, 4, 5, 1, 'CTSP0007', 35, 1250000.00, 1250000.00, N'Mô tả CTSP', GETDATE(), 0),
(3, 3, 4, 6, 4, 4, 'CTSP0008', 40, 1180000.00, 1180000.00, N'Mô tả CTSP', GETDATE(), 0),
(2, 4, 5, 1, 2,2 , 'CTSP0009', 30, 1100000.00, 1100000.00, N'Mô tả CTSP', GETDATE(), 0),
(1, 5, 1, 2, 2, 3, 'CTSP0010', 25, 1050000.00, 1050000.00, N'Mô tả CTSP', GETDATE(), 0),
(2, 1, 2, 3, 3, 4, 'CTSP0011', 60, 1400000.00, 1400000.00, N'Mô tả CTSP', GETDATE(), 0),
(3, 2, 3, 10,4,1, 'CTSP0012', 45, 1350000.00, 1350000.00, N'Mô tả CTSP', GETDATE(), 0),
(4, 3, 4, 8, 3, 4, 'CTSP0013', 50, 1200000.00, 1200000.00, N'Mô tả CTSP', GETDATE(), 0),
(5, 4, 5, 7, 2,2 , 'CTSP0014', 38, 1120000.00, 1120000.00, N'Mô tả CTSP', GETDATE(), 0),
(1, 5, 1, 2,4,4, 'CTSP0015', 42, 1150000.00, 1150000.00, N'Mô tả CTSP', GETDATE(), 0),
(3, 1, 2, 3,2,2 , 'CTSP0016', 48, 1220000.00, 1220000.00, N'Mô tả CTSP', GETDATE(),   0),
(4, 2, 3, 9, 4,1, 'CTSP0017', 32, 1280000.00, 1280000.00, N'Mô tả CTSP', GETDATE(), 0),
(5, 3, 4, 5, 4,1, 'CTSP0018', 28, 1150000.00, 1150000.00, N'Mô tả CTSP', GETDATE(), 0),
(1, 4, 5, 8, 1,5, 'CTSP0019', 22, 1100000.00, 1100000.00, N'Mô tả CTSP', GETDATE(), 0),
(2, 5, 1, 6, 4, 5, 'CTSP0020', 65, 1380000.00, 1380000.00, N'Mô tả CTSP', GETDATE(), 0),
(2, 1, 2, 3, 2,2 , 'CTSP0021', 48, 1220000.00, 1220000.00, N'Mô tả CTSP', GETDATE(), 0),
(1, 2, 3, 9,5,4, 'CTSP0022', 32, 1280000.00, 1280000.00, N'Mô tả CTSP', GETDATE(), 0),
(5, 3, 4, 5, 1, 5, 'CTSP0023', 28, 1150000.00, 1150000.00, N'Mô tả CTSP', GETDATE(), 0)

SELECT * FROM SANPHAM

go
---- kêt thúc phần chỉ sửa
IF OBJECT_ID('KHACHHANG') IS NOT NULL
	DROP TABLE KHACHHANG
CREATE TABLE KHACHHANG
(
	ID BIGINT IDENTITY (1,1) NOT NULL,
	MaKhachHang VARCHAR(20) NULL,
	TenKhachHang NVARCHAR(50) NULL,
	SDT VARCHAR(15) NOT NULL,
	NgaySinh DATE NULL,
	GioiTinh BIT NULL , --- 0  NU , 1 NAM
	Email VARCHAR(50) NULL,
	DiaChi NVARCHAR(100) NULL,
	Diem INT DEFAULT 0 ,
	CapBac INT DEFAULT 0 , -- O DONG 1 BAC 2 VANG 
	NgayTao DATE DEFAULT GETDATE(),
	TrangThai BIT DEFAULT 1 , --- 1 CÒN HOẠT ĐỘNG 0 DỪNG HOẠT ĐỌNG
	CONSTRAINT PK_KHACHHANG PRIMARY KEY (ID) ,
)

--- THEM KHACH HANG
-- Thêm 10 khách hàng giả mạo vào bảng KHACHHANG
INSERT INTO KHACHHANG ( MaKhachHang, TenKhachHang, SDT, NgaySinh, Email, GioiTinh, DiaChi, Diem, CapBac, NgayTao, TrangThai)
VALUES 
( 'KH000', N'Khách bán lẻ', '....', '1990-05-20', '...', 0, N'....', 0, 3, GETDATE(), 1),
( 'KH001', N'Nguyễn Thị Ánh', '0901234567', '1990-05-20', 'manh@gmail.com', 0, N'123 Đường ABC, Quận XYZ', 100, 2, GETDATE(), 1),
( 'KH002', N'Trần Văn Bình', '0912345678', '1985-08-10', 'manh@gmail.com', 1, N'456 Đường DEF, Quận LMN', 50, 1, GETDATE(), 1),
( 'KH003', N'Phạm Minh Châu', '0923456789', '1992-12-25', 'manh@gmail.com', 1, N'789 Đường GHI, Quận OPQ', 200, 2, GETDATE(), 1),
( 'KH004', N'Lê Thị Dương', '0934567890', '1988-04-30', 'manh@gmail.com', 0, N'101 Đường JKL, Quận RST', 150, 1, GETDATE(), 1),
('KH005', N'Ngô Hồng Êm', '0945678901', '1995-07-05', 'manh@gmail.com', 0, N'202 Đường UVW, Quận XYZ', 80, 1, GETDATE(), 1),
( 'KH006', N'Lý Minh Giao', '0956789012', '1980-11-12', 'manh@gmail.com', 1, N'303 Đường LMN, Quận OPQ', 120, 2, GETDATE(), 1),
( 'KH007', N'Nguyễn Thị Hương', '0967890123', '1983-09-18', 'manh@gmail.com', 0, N'404 Đường OPQ, Quận RST', 90, 1, GETDATE(), 1),
('KH008', N'Tạ Đình Hòa', '0978901234', '1998-03-08', 'manh@gmail.com', 1, N'505 Đường RST, Quận UVW', 180, 2, GETDATE(), 1),
( 'KH009', N'Trương Hoàng I', '0989012345', '1993-06-22', 'manh@gmail.com', 1, N'606 Đường XYZ, Quận ABC', 60, 1, GETDATE(), 1),
( 'KH010', N'Vũ Thị Kiều', '0990123456', '1996-09-15', 'manh@gmail.com', 0, N'707 Đường ABC, Quận DEF', 130, 2, GETDATE(), 1);


--- PHIEU GIAM GIA
IF OBJECT_ID('PHIEU_GIAM_GIA') IS NOT NULL
	DROP TABLE PHIEU_GIAM_GIA
CREATE TABLE PHIEU_GIAM_GIA 
(
	ID BIGINT IDENTITY (1,1) NOT NULL,
	IdNV BIGINT NOT NULL,
	MaPhieu NVARCHAR(20) NULL ,
	TenPhieu NVARCHAR(100) NULL,
	LoaiPhieu BIT NULL , -- 0 LÀ % , 1 VND
	GiaTri FLOAT NULL ,-- ++=> sửa lại thành FLoat
	SoLuongPhieu INT NULL,
	DonToiThieu FLOAT NULL , --- ÁNH XẠ JAVA => BigDecimal
	NgayBatDau DATETIME NULL,
	NgayKetThuc DATETIME NULL,
	NgayTao DATE DEFAULT GETDATE(),
	MoTa NVARCHAR(250) NULL,
	TrangThai INT DEFAULT 0 NULL ,
	-- 0 SẮP ĐẾN , 1 ĐANG DIỄN RA , 2 ĐÃ KẾT THÚC , 
	CONSTRAINT PK_PHIEU_GIAM_GIA PRIMARY KEY (ID),
	CONSTRAINT FK_PHIEU_GIAM_GIA_NHANVIEN FOREIGN KEY (IdNV) REFERENCES NHANVIEN (ID)
)


-- Thêm 10 phiếu giảm giá giả mạo vào bảng PHIEU_GIAM_GIA
INSERT INTO PHIEU_GIAM_GIA (IdNV, MaPhieu, TenPhieu, LoaiPhieu, GiaTri, SoLuongPhieu, DonToiThieu, NgayBatDau, NgayKetThuc, MoTa, TrangThai)
VALUES 
(9, 'PGG001', N'Phiếu giảm giá mùa hè', 0, 20, 100, 500000, '2023-07-15T00:00:00', '2023-08-15T23:59:59', N'Áp dụng cho mùa hè 2023 20% hóa đơn', 2),
(18, 'PGG002', N'Phiếu giảm giá tháng 8', 1, 50000, 50, 1000000, '2023-08-01T00:00:00', '2023-08-31T23:59:59', N'Ưu đãi đặc biệt trong tháng 8 50000k / hóa đơn', 2),
(11, 'PGG003', N'Phiếu khuyến mãi năm mới', 0, 15, 200, 2000000, '2024-01-01T00:00:00', '2024-01-15T23:59:59', N'Chào đón năm mới 2024 15% /hóa đơn', 3),
(12, 'PGG004', N'Phiếu giảm giá Big Sale', 1, 100000, 30, 1500000, '2023-09-01T00:00:00', '2023-09-30T23:59:59', N'Ưu đãi lớn trong chương trình Big Sale 100000k / hóa đơn', 2),
(13, 'PGG005', N'Phiếu giảm giá Halloween', 0, 25, 20, 800000, '2023-10-15T00:00:00', '2023-10-31T23:59:59', N'Giảm giá đặc biệt cho Halloween 25% / hóa đơn', 2),
(14, 'PGG006', N'Phiếu khuyến mãi Black Friday', 1, 150000, 10, 2000000, '2023-11-25T00:00:00', '2023-11-30T23:59:59', N'Chương trình khuyến mãi Black Friday 150000k / hóa đơn', 0),
(15, 'PGG007', N'Phiếu giảm giá Cyber Monday', 0, 30, 15, 3000000, '2023-11-30T00:00:00', '2023-12-15T23:59:59', N'Giảm giá trong sự kiện Cyber Monday 30% / hóa đơn', 0),
(16, 'PGG008', N'Phiếu giảm giá Year-End Sale', 1, 200000, 5, 500000, '2023-11-12T00:00:00', '2023-12-31T23:59:59', N'Ưu đãi cuối năm 200000k / hóa đơn', 1),
(17, 'PGG009', N'Phiếu giảm giá Tết Nguyên Đán', 0, 10, 25, 1000000, '2024-01-15T00:00:00', '2024-02-15T23:59:59', N'Giảm giá dịp Tết Nguyên Đán 10 % / hóa đơn', 3),
(10, 'PGG010', N'Phiếu giảm giá Valentine', 1, 75000, 40, 1200000, '2024-02-01T00:00:00', '2024-02-14T23:59:59', N'Ưu đãi đặc biệt cho Valentine 75000k / hóa đơn', 3);

SELECT * FROM PHIEU_GIAM_GIA


IF OBJECT_ID('HOADON') IS NOT NULL
	DROP TABLE HOADON
CREATE TABLE HOADON
(
	ID BIGINT IDENTITY (1,1) NOT NULL,
	IdPGG BIGINT  NULL,
	IdNV BIGINT NOT NULL,
	IdKH BIGINT NOT NULL,
	MaHoaDon VARCHAR(20) NOT NULL,
	TenNguoiNhan nvarchar(250) not null,
	SdtNguoiNhan nvarchar(15) not null,
	DiaChi nvarchar(250) not null,
	TongTienSP MONEY DEFAULT 0.00, -- Thêm mói
	TienPhieuGiam FLOAT DEFAULT 0 ,-- TIỀN GIẢM THEO PHIẾU VND
	TienShip money not null, 
	TienKhDua FLOAT DEFAULT 0,
	TienThua FLOAT DEFAULT 0,
	HinhThucMua BIT DEFAULT 0,-- 0 tại quầy 1 ship
	NgayTao DATETIME DEFAULT GETDATE(),
	NgayShip DATETIME Null,
	NgayThanhToan DATETIME NULL,
	GhiChu nvarchar(250) null,
	TrangThai INT  DEFAULT 0, -- 0 CHƯA THANH TOÁN , 1 ĐÃ THANH TOÁN , 2 ĐANG GIAO , 3 THANH TOÁN TRƯỚC , 4 hủy 
	CONSTRAINT PK_HOADON PRIMARY KEY (ID),
	CONSTRAINT FK_HOADON_PHIEU_GIAM_GIA FOREIGN KEY (IdPGG) REFERENCES PHIEU_GIAM_GIA(ID) ,
	CONSTRAINT FK_HOADON_NHANVIEN FOREIGN KEY (IdNV) REFERENCES NHANVIEN (ID),
	CONSTRAINT FK_HOADON_KHACHHANG FOREIGN KEY (IdKH) REFERENCES KHACHHANG (ID)
)

SELECT *FROM KHACHHANG
INSERT INTO HOADON (IdPGG, IdNV, IdKH, MaHoaDon, TenNguoiNhan, SdtNguoiNhan, DiaChi, TongTienSP, TienPhieuGiam, TienShip, TienKhDua,  TienThua, NgayThanhToan, TrangThai)
VALUES 
(NULL, 9, 2, 'HD001' , N'Trần Văn A', '0123456789', 'abc', 130000, 10000, 10000, 130000,0, '2023-11-1', 1),
(NULL, 10, 2, 'HD002' , N'Trần Văn A', '0222456789', 'abc', 130000, 10000, 10000, 130000,0, '2023-12-1', 1),
(NULL, 11, 3, 'HD003' , N'Trần Văn A', '0333456789', 'abc', 130000, 10000, 10000, 130000,0, '2024-1-1', 1),
(NULL, 12, 4, 'HD004' , N'Trần Văn A', '0444456789', 'abc', 130000, 10000, 10000, 130000,0, '2024-1-1', 1),
(NULL, 13, 5, 'HD005' , N'Trần Văn A', '0555556789', 'abc', 130000, 10000, 10000, 130000,0, '2024-1-2', 1),
(NULL, 14, 3, 'HD006' , N'Trần Văn A', '0432156789', 'abc', 130000, 10000, 10000, 130000,0, '2024-1-2', 1)


--- HÓA ĐƠN CHI TIẾT
IF OBJECT_ID('HOADONCHITIET') IS NOT NULL
	DROP TABLE HOADONCHITIET
CREATE TABLE HOADONCHITIET
(
	ID BIGINT IDENTITY (1,1) NOT NULL,
	IdHoaDon BIGINT NOT NULL ,
	IdSP BIGINT NOT NULL,
	MaHoaDonCT VARCHAR(20) NOT NULL,
	SoLuong INT NULL,
	DonGia FLOAT NULL,
	ThanhTien FLOAT NULL,
	NgayTao DATETIME DEFAULT GETDATE(),
	TrangThai INT NULL,
	CONSTRAINT PK_HOADONCHITIET PRIMARY KEY (ID),
	CONSTRAINT FK_HOADONCHITIET_HOADON FOREIGN KEY (IdHoaDon) REFERENCES HOADON  (ID),
	CONSTRAINT FK_HOADONCHITIET_CHI_TIET_SAN_PHAM FOREIGN KEY (IdSP) REFERENCES SanPhaM (ID)
)
--select * from HOADON
INSERT INTO HOADONCHITIET (IdHoaDon, IdSP,MaHoaDonCT, SoLuong, DonGia, ThanhTien,NgayTao, TrangThai)
VALUES 
(1, 2, 2, 1, 750000, 375000, GETDATE(), 1),
(2, 3, 2, 1, 750000, 375000, GETDATE(), 1),
(3, 4, 2, 1, 750000, 375000, GETDATE(), 1),
(4, 5, 2, 1, 750000, 375000, GETDATE(), 1),
(5, 6, 2, 1, 750000, 375000, GETDATE(), 1),
(6, 7, 2, 1, 750000, 375000, GETDATE(), 1)

SELECT * FROM HOADON
SELECT * FROM HOADONCHITIET






