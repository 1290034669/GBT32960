package com.yzxc.common.enums;

public enum DataStationEnum {

    FACTORY(10001,"data:hydrogen_factory_data"),
    STATION(10002,"data:hydrogen_station_data"),
    VEHICLE(10003,"data:hydrogen_vehicle_data"),
    CARRIER(10004,"data:hydrogen_carrier_data"),
    ALARM(20001,"warning_information");

    private final Integer typeId;
    private final String tableName;

    DataStationEnum(Integer typeId, String tableName) {
        this.typeId = typeId;
        this.tableName = tableName;
    }

    public static String findTableNameByTypeId(Integer typeId) {
        switch (typeId) {
            case 10001:
                return FACTORY.getTableName();
            case 10002:
                return STATION.getTableName();
            case 10003:
                return VEHICLE.getTableName();
            case 10004:
                return CARRIER.getTableName();
            case 20001:
                return ALARM.getTableName();
            default:
                return null;
        }
    }

    public Integer getTypeId() {
        return typeId;
    }

    public String getTableName() {
        return tableName;
    }

    @Override
    public String toString() {
        return "DataStationEnum{" +
                "typeId=" + typeId +
                ", tableName='" + tableName + '\'' +
                '}';
    }
}
