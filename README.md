### Setp1
Import the Seata configuration from nacos_seata_config into nacos and modify the MySQL connection

### Setp2
Import the SQL file from `sql.mysql` into the MySQL8.0

### Setp3
Post request to http://localhost:48080/admin-api/system/seataTest/saveSeataTest

### Main file path
```
cn.iocoder.yudao.module.infra.api.seataTest.SeataTestApi
cn.iocoder.yudao.module.infra.service.seatTest.SeataTestServiceImpl
cn.iocoder.yudao.module.system.controller.admin.seataTest.SeataTestController
cn.iocoder.yudao.module.system.service.seataTest.SeataTestServiceImpl
```