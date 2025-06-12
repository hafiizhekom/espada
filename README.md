# Espada - Simple Expedition Application

Espada is a desktop application built with Java Swing for managing expedition shipments. It includes features for managing shipments, couriers, services, regions, data export/import, and data visualization in chart form.

## Main Features

- **Shipment Management**  
  Manage shipment data, items, verification, and shipment search.  
  See: [`com.espada.gui.Pengiriman`](src/com/espada/gui/Pengiriman.java)

- **Courier Management**  
  Add, edit, delete, and import/export courier data.  
  See: [`com.espada.gui.Kurir`](src/com/espada/gui/Kurir.java)

- **Service Management**  
  Manage types of delivery services.  
  See: [`com.espada.model.qLayanan`](src/com/espada/model/qLayanan.java)

- **Region Management**  
  Manage province, regency, and district data for shipments.  
  See:  
  - [`com.espada.gui.wilayah.Provinsi`](src/com/espada/gui/wilayah/Provinsi.java)  
  - [`com.espada.model.qProvinsi`](src/com/espada/model/qProvinsi.java)  
  - [`com.espada.model.qKabupaten`](src/com/espada/model/qKabupaten.java)  
  - [`com.espada.model.qKecamatan`](src/com/espada/model/qKecamatan.java)

- **Tariff Management**  
  Set shipping tariffs based on region and service.  
  See: [`com.espada.gui.Tarif`](src/com/espada/gui/Tarif.java)

- **Excel Data Export & Import**  
  Export and import shipment, courier, and service data to/from Excel.  
  See:  
  - [`com.espada.gui.excel.exportz.Pengiriman`](src/com/espada/gui/excel/exportz/Pengiriman.java)  
  - [`com.espada.gui.excel.importz.Pengiriman`](src/com/espada/gui/excel/importz/Pengiriman.java)  
  - [`com.espada.gui.excel.exportz.Kurir`](src/com/espada/gui/excel/exportz/Kurir.java)  
  - [`com.espada.gui.excel.importz.Kurir`](src/com/espada/gui/excel/importz/Kurir.java)

- **Data Visualization (Charts)**  
  Display shipment, service, courier, and region statistics in chart form (pie/bar/line).  
  See: [`com.espada.Chart`](src/com/espada/Chart.java)

- **Business & Administrator Settings**  
  Manage business and application administrator data.  
  See:  
  - [`com.espada.gui.SetUsaha`](src/com/espada/gui/SetUsaha.java)  
  - [`com.espada.gui.Administrator`](src/com/espada/gui/Administrator.java)

- **Login & Access Control**  
  User login and authorization system.  
  See: [`com.espada.gui.Login`](src/com/espada/gui/Login.java)

- **Utilities**  
  - Password hashing: [`com.espada.Hash`](src/com/espada/Hash.java)
  - Windows registry: [`com.espada.RegistryKey`](src/com/espada/RegistryKey.java)
  - Database connection: [`com.espada.Koneksi`](src/com/espada/Koneksi.java)
  - General tools: [`com.espada.Tools`](src/com/espada/Tools.java)

## How to Run

1. **Build the Project**  
   Use NetBeans or run the following command in the project root:
   ```sh
   ant clean; ant jar
   ```
2. **Run the Application**  
   Main file: [`com.espada.main.Loading`](src/com/espada/main/Loading.java)  
   Or run the JAR file in the `dist/` folder.

## Dependencies

- Java 7+
- External libraries in the [lib/](lib/) folder
- MySQL Database (see configuration in [`com.espada.Koneksi`](src/com/espada/Koneksi.java))
