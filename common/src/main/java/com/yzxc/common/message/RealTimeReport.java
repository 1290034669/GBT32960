package com.yzxc.common.message;

import com.google.protobuf.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RealTimeReport extends GeneratedMessageV3 implements RealTimeReportOrBuilder, Serializable {

    private RealTimeReport(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private RealTimeReport() {
        recordTime_ = 0L;
        reissue_ = false;
        motor_ = Collections.emptyList();
        chargeSystemElectric_ = Collections.emptyList();
        chargeSystemTemperature_ = Collections.emptyList();
    }

    private RealTimeReport(
            CodedInputStream input,
            ExtensionRegistryLite extensionRegistry)
            throws InvalidProtocolBufferException {
        this();
        int mutable_bitField0_ = 0;
        try {
            boolean done = false;
            while (!done) {
                int tag = input.readTag();
                switch (tag) {
                    case 0: {
                        done = !input.skipField(tag);
                    }
                    break;
                    case 8: {
                        recordTime_ = input.readInt64();
                    }
                    break;
                    case 16: {
                        reissue_ = input.readBool();
                    }
                    break;
                    case 26: {
                        VehicleState.Builder subBuilder = null;
                        if (vehicleState_ != null) {
                            subBuilder = vehicleState_.toBuilder();
                        }
                        vehicleState_ = input.readMessage(VehicleState.parser(), extensionRegistry);
                        if (subBuilder != null) {
                            subBuilder.mergeFrom(vehicleState_);
                            vehicleState_ = subBuilder.buildPartial();
                        }

                    }
                    break;
                    case 34: {
                        if (!((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
                            motor_ = new ArrayList<MotorState>();
                            mutable_bitField0_ |= 0x00000008;
                        }
                        motor_.add(
                                input.readMessage(MotorState.parser(), extensionRegistry));
                    }
                    break;
                    case 42: {
                        FuelCell.Builder subBuilder = null;
                        if (fuelCell_ != null) {
                            subBuilder = fuelCell_.toBuilder();
                        }
                        fuelCell_ = input.readMessage(FuelCell.parser(), extensionRegistry);
                        if (subBuilder != null) {
                            subBuilder.mergeFrom(fuelCell_);
                            fuelCell_ = subBuilder.buildPartial();
                        }

                    }
                    break;
                    case 50: {
                        Engine.Builder subBuilder = null;
                        if (engine_ != null) {
                            subBuilder = engine_.toBuilder();
                        }
                        engine_ = input.readMessage(Engine.parser(), extensionRegistry);
                        if (subBuilder != null) {
                            subBuilder.mergeFrom(engine_);
                            engine_ = subBuilder.buildPartial();
                        }

                    }
                    break;
                    case 58: {
                        VehicleLocation.Builder subBuilder = null;
                        if (location_ != null) {
                            subBuilder = location_.toBuilder();
                        }
                        location_ = input.readMessage(VehicleLocation.parser(), extensionRegistry);
                        if (subBuilder != null) {
                            subBuilder.mergeFrom(location_);
                            location_ = subBuilder.buildPartial();
                        }

                    }
                    break;
                    case 66: {
                        Extremum.Builder subBuilder = null;
                        if (extremum_ != null) {
                            subBuilder = extremum_.toBuilder();
                        }
                        extremum_ = input.readMessage(Extremum.parser(), extensionRegistry);
                        if (subBuilder != null) {
                            subBuilder.mergeFrom(extremum_);
                            extremum_ = subBuilder.buildPartial();
                        }

                    }
                    break;
                    case 74: {
                        Alarm.Builder subBuilder = null;
                        if (alarm_ != null) {
                            subBuilder = alarm_.toBuilder();
                        }
                        alarm_ = input.readMessage(Alarm.parser(), extensionRegistry);
                        if (subBuilder != null) {
                            subBuilder.mergeFrom(alarm_);
                            alarm_ = subBuilder.buildPartial();
                        }

                    }
                    break;
                    case 82: {
                        if (!((mutable_bitField0_ & 0x00000200) == 0x00000200)) {
                            chargeSystemElectric_ = new ArrayList<ChargeableSubsystemElectric>();
                            mutable_bitField0_ |= 0x00000200;
                        }
                        chargeSystemElectric_.add(
                                input.readMessage(ChargeableSubsystemElectric.parser(), extensionRegistry));
                    }
                    break;
                    case 90: {
                        if (!((mutable_bitField0_ & 0x00000400) == 0x00000400)) {
                            chargeSystemTemperature_ = new ArrayList<ChargeableSubsystemTemperature>();
                            mutable_bitField0_ |= 0x00000400;
                        }
                        chargeSystemTemperature_.add(
                                input.readMessage(ChargeableSubsystemTemperature.parser(), extensionRegistry));
                    }
                    break;
                    default:
                        break;
                }
            }
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(this);
        } catch (java.io.IOException e) {
            throw new InvalidProtocolBufferException(
                    e).setUnfinishedMessage(this);
        } finally {
            if (((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
                motor_ = Collections.unmodifiableList(motor_);
            }
            if (((mutable_bitField0_ & 0x00000200) == 0x00000200)) {
                chargeSystemElectric_ = Collections.unmodifiableList(chargeSystemElectric_);
            }
            if (((mutable_bitField0_ & 0x00000400) == 0x00000400)) {
                chargeSystemTemperature_ = Collections.unmodifiableList(chargeSystemTemperature_);
            }
            makeExtensionsImmutable();
        }
    }

    public static Descriptors.Descriptor
    getDescriptor() {
        return Gbt3260.internal_static_com_ime_iov_gbt32960_RealTimeReport_descriptor;
    }

    protected FieldAccessorTable
    internalGetFieldAccessorTable() {
        return Gbt3260.internal_static_com_ime_iov_gbt32960_RealTimeReport_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                        RealTimeReport.class, Builder.class);
    }

    private int bitField0_;

    public static final int RECORD_TIME_FIELD_NUMBER = 1;
    private long recordTime_;

    public long getRecordTime() {
        return recordTime_;
    }

    public static final int REISSUE_FIELD_NUMBER = 2;

    private boolean reissue_;

    public boolean getReissue() {
        return reissue_;
    }

    public static final int VEHICLESTATE_FIELD_NUMBER = 3;

    private VehicleState vehicleState_;

    public boolean hasVehicleState() {
        return vehicleState_ != null;
    }

    public VehicleState getVehicleState() {
        return vehicleState_ == null ? VehicleState.getDefaultInstance() : vehicleState_;
    }

    public VehicleStateOrBuilder getVehicleStateOrBuilder() {
        return getVehicleState();
    }

    public static final int MOTOR_FIELD_NUMBER = 4;

    private List<MotorState> motor_;

    public List<MotorState> getMotorList() {
        return motor_;
    }

    public List<? extends MotorStateOrBuilder>
    getMotorOrBuilderList() {
        return motor_;
    }

    public int getMotorCount() {
        return motor_.size();
    }

    public MotorState getMotor(int index) {
        return motor_.get(index);
    }

    public MotorStateOrBuilder getMotorOrBuilder(
            int index) {
        return motor_.get(index);
    }

    public static final int FUELCELL_FIELD_NUMBER = 5;

    private FuelCell fuelCell_;

    public boolean hasFuelCell() {
        return fuelCell_ != null;
    }

    public FuelCell getFuelCell() {
        return fuelCell_ == null ? FuelCell.getDefaultInstance() : fuelCell_;
    }

    public FuelCellOrBuilder getFuelCellOrBuilder() {
        return getFuelCell();
    }

    public static final int ENGINE_FIELD_NUMBER = 6;

    private Engine engine_;

    public boolean hasEngine() {
        return engine_ != null;
    }

    public Engine getEngine() {
        return engine_ == null ? Engine.getDefaultInstance() : engine_;
    }

    public EngineOrBuilder getEngineOrBuilder() {
        return getEngine();
    }

    public static final int LOCATION_FIELD_NUMBER = 7;

    private VehicleLocation location_;

    public boolean hasLocation() {
        return location_ != null;
    }

    public VehicleLocation getLocation() {
        return location_ == null ? VehicleLocation.getDefaultInstance() : location_;
    }

    public VehicleLocationOrBuilder getLocationOrBuilder() {
        return getLocation();
    }

    public static final int EXTREMUM_FIELD_NUMBER = 8;

    private Extremum extremum_;

    public boolean hasExtremum() {
        return extremum_ != null;
    }

    public Extremum getExtremum() {
        return extremum_ == null ? Extremum.getDefaultInstance() : extremum_;
    }

    public ExtremumOrBuilder getExtremumOrBuilder() {
        return getExtremum();
    }

    public static final int ALARM_FIELD_NUMBER = 9;

    private Alarm alarm_;

    public boolean hasAlarm() {
        return alarm_ != null;
    }

    public Alarm getAlarm() {
        return alarm_ == null ? Alarm.getDefaultInstance() : alarm_;
    }

    public AlarmOrBuilder getAlarmOrBuilder() {
        return getAlarm();
    }

    public static final int CHARGESYSTEMELECTRIC_FIELD_NUMBER = 10;

    private List<ChargeableSubsystemElectric> chargeSystemElectric_;

    public List<ChargeableSubsystemElectric> getChargeSystemElectricList() {
        return chargeSystemElectric_;
    }

    public List<? extends ChargeableSubsystemElectricOrBuilder>
    getChargeSystemElectricOrBuilderList() {
        return chargeSystemElectric_;
    }

    public int getChargeSystemElectricCount() {
        return chargeSystemElectric_.size();
    }

    public ChargeableSubsystemElectric getChargeSystemElectric(int index) {
        return chargeSystemElectric_.get(index);
    }

    public ChargeableSubsystemElectricOrBuilder getChargeSystemElectricOrBuilder(
            int index) {
        return chargeSystemElectric_.get(index);
    }

    public static final int CHARGESYSTEMTEMPERATURE_FIELD_NUMBER = 11;

    private List<ChargeableSubsystemTemperature> chargeSystemTemperature_;

    public List<ChargeableSubsystemTemperature> getChargeSystemTemperatureList() {
        return chargeSystemTemperature_;
    }

    public List<? extends ChargeableSubsystemTemperatureOrBuilder>
    getChargeSystemTemperatureOrBuilderList() {
        return chargeSystemTemperature_;
    }

    public int getChargeSystemTemperatureCount() {
        return chargeSystemTemperature_.size();
    }

    public ChargeableSubsystemTemperature getChargeSystemTemperature(int index) {
        return chargeSystemTemperature_.get(index);
    }

    public ChargeableSubsystemTemperatureOrBuilder getChargeSystemTemperatureOrBuilder(
            int index) {
        return chargeSystemTemperature_.get(index);
    }

    private byte memoizedIsInitialized = -1;

    public final boolean isInitialized() {
        byte isInitialized = memoizedIsInitialized;
        if (isInitialized == 1) return true;
        if (isInitialized == 0) return false;

        memoizedIsInitialized = 1;
        return true;
    }

    public void writeTo(CodedOutputStream output)
            throws java.io.IOException {
        if (recordTime_ != 0L) {
            output.writeInt64(1, recordTime_);
        }
        if (reissue_) {
            output.writeBool(2, reissue_);
        }
        if (vehicleState_ != null) {
            output.writeMessage(3, getVehicleState());
        }
        for (MotorState motorState : motor_) {
            output.writeMessage(4, motorState);
        }
        if (fuelCell_ != null) {
            output.writeMessage(5, getFuelCell());
        }
        if (engine_ != null) {
            output.writeMessage(6, getEngine());
        }
        if (location_ != null) {
            output.writeMessage(7, getLocation());
        }
        if (extremum_ != null) {
            output.writeMessage(8, getExtremum());
        }
        if (alarm_ != null) {
            output.writeMessage(9, getAlarm());
        }
        for (ChargeableSubsystemElectric chargeableSubsystemElectric : chargeSystemElectric_) {
            output.writeMessage(10, chargeableSubsystemElectric);
        }
        for (ChargeableSubsystemTemperature chargeableSubsystemTemperature : chargeSystemTemperature_) {
            output.writeMessage(11, chargeableSubsystemTemperature);
        }
    }

    public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1) return size;

        size = 0;
        if (recordTime_ != 0L) {
            size += CodedOutputStream
                    .computeInt64Size(1, recordTime_);
        }
        if (reissue_) {
            size += CodedOutputStream
                    .computeBoolSize(2, reissue_);
        }
        if (vehicleState_ != null) {
            size += CodedOutputStream
                    .computeMessageSize(3, getVehicleState());
        }
        for (MotorState motorState : motor_) {
            size += CodedOutputStream
                    .computeMessageSize(4, motorState);
        }
        if (fuelCell_ != null) {
            size += CodedOutputStream
                    .computeMessageSize(5, getFuelCell());
        }
        if (engine_ != null) {
            size += CodedOutputStream
                    .computeMessageSize(6, getEngine());
        }
        if (location_ != null) {
            size += CodedOutputStream
                    .computeMessageSize(7, getLocation());
        }
        if (extremum_ != null) {
            size += CodedOutputStream
                    .computeMessageSize(8, getExtremum());
        }
        if (alarm_ != null) {
            size += CodedOutputStream
                    .computeMessageSize(9, getAlarm());
        }
        for (ChargeableSubsystemElectric chargeableSubsystemElectric : chargeSystemElectric_) {
            size += CodedOutputStream
                    .computeMessageSize(10, chargeableSubsystemElectric);
        }
        for (ChargeableSubsystemTemperature chargeableSubsystemTemperature : chargeSystemTemperature_) {
            size += CodedOutputStream
                    .computeMessageSize(11, chargeableSubsystemTemperature);
        }
        memoizedSize = size;
        return size;
    }

    private static final long serialVersionUID = 0L;

    @Override
    public boolean equals(final Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RealTimeReport)) {
            return super.equals(obj);
        }
        RealTimeReport other = (RealTimeReport) obj;

        boolean result = true;
        result = result && (getRecordTime()
                == other.getRecordTime());
        result = result && (getReissue()
                == other.getReissue());
        result = result && (hasVehicleState() == other.hasVehicleState());
        if (hasVehicleState()) {
            result = result && getVehicleState()
                    .equals(other.getVehicleState());
        }
        result = result && getMotorList()
                .equals(other.getMotorList());
        result = result && (hasFuelCell() == other.hasFuelCell());
        if (hasFuelCell()) {
            result = result && getFuelCell()
                    .equals(other.getFuelCell());
        }
        result = result && (hasEngine() == other.hasEngine());
        if (hasEngine()) {
            result = result && getEngine()
                    .equals(other.getEngine());
        }
        result = result && (hasLocation() == other.hasLocation());
        if (hasLocation()) {
            result = result && getLocation()
                    .equals(other.getLocation());
        }
        result = result && (hasExtremum() == other.hasExtremum());
        if (hasExtremum()) {
            result = result && getExtremum()
                    .equals(other.getExtremum());
        }
        result = result && (hasAlarm() == other.hasAlarm());
        if (hasAlarm()) {
            result = result && getAlarm()
                    .equals(other.getAlarm());
        }
        result = result && getChargeSystemElectricList()
                .equals(other.getChargeSystemElectricList());
        result = result && getChargeSystemTemperatureList()
                .equals(other.getChargeSystemTemperatureList());
        return result;
    }

    @Override
    public int hashCode() {
        if (memoizedHashCode != 0) {
            return memoizedHashCode;
        }
        int hash = 41;
        hash = (19 * hash) + getDescriptorForType().hashCode();
        hash = (37 * hash) + RECORD_TIME_FIELD_NUMBER;
        hash = (53 * hash) + Internal.hashLong(
                getRecordTime());
        hash = (37 * hash) + REISSUE_FIELD_NUMBER;
        hash = (53 * hash) + Internal.hashBoolean(
                getReissue());
        if (hasVehicleState()) {
            hash = (37 * hash) + VEHICLESTATE_FIELD_NUMBER;
            hash = (53 * hash) + getVehicleState().hashCode();
        }
        if (getMotorCount() > 0) {
            hash = (37 * hash) + MOTOR_FIELD_NUMBER;
            hash = (53 * hash) + getMotorList().hashCode();
        }
        if (hasFuelCell()) {
            hash = (37 * hash) + FUELCELL_FIELD_NUMBER;
            hash = (53 * hash) + getFuelCell().hashCode();
        }
        if (hasEngine()) {
            hash = (37 * hash) + ENGINE_FIELD_NUMBER;
            hash = (53 * hash) + getEngine().hashCode();
        }
        if (hasLocation()) {
            hash = (37 * hash) + LOCATION_FIELD_NUMBER;
            hash = (53 * hash) + getLocation().hashCode();
        }
        if (hasExtremum()) {
            hash = (37 * hash) + EXTREMUM_FIELD_NUMBER;
            hash = (53 * hash) + getExtremum().hashCode();
        }
        if (hasAlarm()) {
            hash = (37 * hash) + ALARM_FIELD_NUMBER;
            hash = (53 * hash) + getAlarm().hashCode();
        }
        if (getChargeSystemElectricCount() > 0) {
            hash = (37 * hash) + CHARGESYSTEMELECTRIC_FIELD_NUMBER;
            hash = (53 * hash) + getChargeSystemElectricList().hashCode();
        }
        if (getChargeSystemTemperatureCount() > 0) {
            hash = (37 * hash) + CHARGESYSTEMTEMPERATURE_FIELD_NUMBER;
            hash = (53 * hash) + getChargeSystemTemperatureList().hashCode();
        }
        hash = (29 * hash) + unknownFields.hashCode();
        memoizedHashCode = hash;
        return hash;
    }

    public static RealTimeReport parseFrom(
            ByteString data)
            throws InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static RealTimeReport parseFrom(
            ByteString data,
            ExtensionRegistryLite extensionRegistry)
            throws InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static RealTimeReport parseFrom(byte[] data)
            throws InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static RealTimeReport parseFrom(
            byte[] data,
            ExtensionRegistryLite extensionRegistry)
            throws InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static RealTimeReport parseFrom(java.io.InputStream input)
            throws java.io.IOException {
        return GeneratedMessageV3
                .parseWithIOException(PARSER, input);
    }

    public static RealTimeReport parseFrom(
            java.io.InputStream input,
            ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return GeneratedMessageV3
                .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static RealTimeReport parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
        return GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input);
    }

    public static RealTimeReport parseDelimitedFrom(
            java.io.InputStream input,
            ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static RealTimeReport parseFrom(
            CodedInputStream input)
            throws java.io.IOException {
        return GeneratedMessageV3
                .parseWithIOException(PARSER, input);
    }

    public static RealTimeReport parseFrom(
            CodedInputStream input,
            ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return GeneratedMessageV3
                .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(RealTimeReport prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE
                ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
            BuilderParent parent) {
        return new Builder(parent);
    }

    public static final class Builder extends
            GeneratedMessageV3.Builder<Builder> implements
            RealTimeReportOrBuilder {

        public static Descriptors.Descriptor
        getDescriptor() {
            return Gbt3260.internal_static_com_ime_iov_gbt32960_RealTimeReport_descriptor;
        }

        protected FieldAccessorTable
        internalGetFieldAccessorTable() {
            return Gbt3260.internal_static_com_ime_iov_gbt32960_RealTimeReport_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            RealTimeReport.class, Builder.class);
        }

        private Builder() {
            maybeForceBuilderInitialization();
        }

        private Builder(
                BuilderParent parent) {
            super(parent);
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            if (GeneratedMessageV3
                    .alwaysUseFieldBuilders) {
                getMotorFieldBuilder();
                getChargeSystemElectricFieldBuilder();
                getChargeSystemTemperatureFieldBuilder();
            }
        }

        public Builder clear() {
            super.clear();
            recordTime_ = 0L;

            reissue_ = false;

            if (vehicleStateBuilder_ == null) {
                vehicleState_ = null;
            } else {
                vehicleState_ = null;
                vehicleStateBuilder_ = null;
            }
            if (motorBuilder_ == null) {
                motor_ = Collections.emptyList();
                bitField0_ = (bitField0_ & ~0x00000008);
            } else {
                motorBuilder_.clear();
            }
            if (fuelCellBuilder_ == null) {
                fuelCell_ = null;
            } else {
                fuelCell_ = null;
                fuelCellBuilder_ = null;
            }
            if (engineBuilder_ == null) {
                engine_ = null;
            } else {
                engine_ = null;
                engineBuilder_ = null;
            }
            if (locationBuilder_ == null) {
                location_ = null;
            } else {
                location_ = null;
                locationBuilder_ = null;
            }
            if (extremumBuilder_ == null) {
                extremum_ = null;
            } else {
                extremum_ = null;
                extremumBuilder_ = null;
            }
            if (alarmBuilder_ == null) {
                alarm_ = null;
            } else {
                alarm_ = null;
                alarmBuilder_ = null;
            }
            if (chargeSystemElectricBuilder_ == null) {
                chargeSystemElectric_ = Collections.emptyList();
                bitField0_ = (bitField0_ & ~0x00000200);
            } else {
                chargeSystemElectricBuilder_.clear();
            }
            if (chargeSystemTemperatureBuilder_ == null) {
                chargeSystemTemperature_ = Collections.emptyList();
                bitField0_ = (bitField0_ & ~0x00000400);
            } else {
                chargeSystemTemperatureBuilder_.clear();
            }
            return this;
        }

        public Descriptors.Descriptor
        getDescriptorForType() {
            return Gbt3260.internal_static_com_ime_iov_gbt32960_RealTimeReport_descriptor;
        }

        public RealTimeReport getDefaultInstanceForType() {
            return RealTimeReport.getDefaultInstance();
        }

        public RealTimeReport build() {
            RealTimeReport result = buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            }
            return result;
        }

        public RealTimeReport buildPartial() {
            RealTimeReport result = new RealTimeReport(this);
            int from_bitField0_ = bitField0_;
            int to_bitField0_ = 0;
            result.recordTime_ = recordTime_;
            result.reissue_ = reissue_;
            if (vehicleStateBuilder_ == null) {
                result.vehicleState_ = vehicleState_;
            } else {
                result.vehicleState_ = vehicleStateBuilder_.build();
            }
            if (motorBuilder_ == null) {
                if (((bitField0_ & 0x00000008) == 0x00000008)) {
                    motor_ = Collections.unmodifiableList(motor_);
                    bitField0_ = (bitField0_ & ~0x00000008);
                }
                result.motor_ = motor_;
            } else {
                result.motor_ = motorBuilder_.build();
            }
            if (fuelCellBuilder_ == null) {
                result.fuelCell_ = fuelCell_;
            } else {
                result.fuelCell_ = fuelCellBuilder_.build();
            }
            if (engineBuilder_ == null) {
                result.engine_ = engine_;
            } else {
                result.engine_ = engineBuilder_.build();
            }
            if (locationBuilder_ == null) {
                result.location_ = location_;
            } else {
                result.location_ = locationBuilder_.build();
            }
            if (extremumBuilder_ == null) {
                result.extremum_ = extremum_;
            } else {
                result.extremum_ = extremumBuilder_.build();
            }
            if (alarmBuilder_ == null) {
                result.alarm_ = alarm_;
            } else {
                result.alarm_ = alarmBuilder_.build();
            }
            if (chargeSystemElectricBuilder_ == null) {
                if (((bitField0_ & 0x00000200) == 0x00000200)) {
                    chargeSystemElectric_ = Collections.unmodifiableList(chargeSystemElectric_);
                    bitField0_ = (bitField0_ & ~0x00000200);
                }
                result.chargeSystemElectric_ = chargeSystemElectric_;
            } else {
                result.chargeSystemElectric_ = chargeSystemElectricBuilder_.build();
            }
            if (chargeSystemTemperatureBuilder_ == null) {
                if (((bitField0_ & 0x00000400) == 0x00000400)) {
                    chargeSystemTemperature_ = Collections.unmodifiableList(chargeSystemTemperature_);
                    bitField0_ = (bitField0_ & ~0x00000400);
                }
                result.chargeSystemTemperature_ = chargeSystemTemperature_;
            } else {
                result.chargeSystemTemperature_ = chargeSystemTemperatureBuilder_.build();
            }
            result.bitField0_ = to_bitField0_;
            onBuilt();
            return result;
        }

        public Builder clone() {
            return super.clone();
        }

        public Builder setField(
                Descriptors.FieldDescriptor field,
                Object value) {
            return super.setField(field, value);
        }

        public Builder clearField(
                Descriptors.FieldDescriptor field) {
            return super.clearField(field);
        }

        public Builder clearOneof(
                Descriptors.OneofDescriptor oneof) {
            return super.clearOneof(oneof);
        }

        public Builder setRepeatedField(
                Descriptors.FieldDescriptor field,
                int index, Object value) {
            return super.setRepeatedField(field, index, value);
        }

        public Builder addRepeatedField(
                Descriptors.FieldDescriptor field,
                Object value) {
            return super.addRepeatedField(field, value);
        }

        public Builder mergeFrom(Message other) {
            if (other instanceof RealTimeReport) {
                return mergeFrom((RealTimeReport) other);
            } else {
                super.mergeFrom(other);
                return this;
            }
        }

        public Builder mergeFrom(RealTimeReport other) {
            if (other == RealTimeReport.getDefaultInstance()) return this;
            if (other.getRecordTime() != 0L) {
                setRecordTime(other.getRecordTime());
            }
            if (other.getReissue()) {
                setReissue(other.getReissue());
            }
            if (other.hasVehicleState()) {
                mergeVehicleState(other.getVehicleState());
            }
            if (motorBuilder_ == null) {
                if (!other.motor_.isEmpty()) {
                    if (motor_.isEmpty()) {
                        motor_ = other.motor_;
                        bitField0_ = (bitField0_ & ~0x00000008);
                    } else {
                        ensureMotorIsMutable();
                        motor_.addAll(other.motor_);
                    }
                    onChanged();
                }
            } else {
                if (!other.motor_.isEmpty()) {
                    if (motorBuilder_.isEmpty()) {
                        motorBuilder_.dispose();
                        motorBuilder_ = null;
                        motor_ = other.motor_;
                        bitField0_ = (bitField0_ & ~0x00000008);
                        motorBuilder_ =
                                GeneratedMessageV3.alwaysUseFieldBuilders ?
                                        getMotorFieldBuilder() : null;
                    } else {
                        motorBuilder_.addAllMessages(other.motor_);
                    }
                }
            }
            if (other.hasFuelCell()) {
                mergeFuelCell(other.getFuelCell());
            }
            if (other.hasEngine()) {
                mergeEngine(other.getEngine());
            }
            if (other.hasLocation()) {
                mergeLocation(other.getLocation());
            }
            if (other.hasExtremum()) {
                mergeExtremum(other.getExtremum());
            }
            if (other.hasAlarm()) {
                mergeAlarm(other.getAlarm());
            }
            if (chargeSystemElectricBuilder_ == null) {
                if (!other.chargeSystemElectric_.isEmpty()) {
                    if (chargeSystemElectric_.isEmpty()) {
                        chargeSystemElectric_ = other.chargeSystemElectric_;
                        bitField0_ = (bitField0_ & ~0x00000200);
                    } else {
                        ensureChargeSystemElectricIsMutable();
                        chargeSystemElectric_.addAll(other.chargeSystemElectric_);
                    }
                    onChanged();
                }
            } else {
                if (!other.chargeSystemElectric_.isEmpty()) {
                    if (chargeSystemElectricBuilder_.isEmpty()) {
                        chargeSystemElectricBuilder_.dispose();
                        chargeSystemElectricBuilder_ = null;
                        chargeSystemElectric_ = other.chargeSystemElectric_;
                        bitField0_ = (bitField0_ & ~0x00000200);
                        chargeSystemElectricBuilder_ =
                                GeneratedMessageV3.alwaysUseFieldBuilders ?
                                        getChargeSystemElectricFieldBuilder() : null;
                    } else {
                        chargeSystemElectricBuilder_.addAllMessages(other.chargeSystemElectric_);
                    }
                }
            }
            if (chargeSystemTemperatureBuilder_ == null) {
                if (!other.chargeSystemTemperature_.isEmpty()) {
                    if (chargeSystemTemperature_.isEmpty()) {
                        chargeSystemTemperature_ = other.chargeSystemTemperature_;
                        bitField0_ = (bitField0_ & ~0x00000400);
                    } else {
                        ensureChargeSystemTemperatureIsMutable();
                        chargeSystemTemperature_.addAll(other.chargeSystemTemperature_);
                    }
                    onChanged();
                }
            } else {
                if (!other.chargeSystemTemperature_.isEmpty()) {
                    if (chargeSystemTemperatureBuilder_.isEmpty()) {
                        chargeSystemTemperatureBuilder_.dispose();
                        chargeSystemTemperatureBuilder_ = null;
                        chargeSystemTemperature_ = other.chargeSystemTemperature_;
                        bitField0_ = (bitField0_ & ~0x00000400);
                        chargeSystemTemperatureBuilder_ =
                                GeneratedMessageV3.alwaysUseFieldBuilders ?
                                        getChargeSystemTemperatureFieldBuilder() : null;
                    } else {
                        chargeSystemTemperatureBuilder_.addAllMessages(other.chargeSystemTemperature_);
                    }
                }
            }
            onChanged();
            return this;
        }

        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeFrom(
                CodedInputStream input,
                ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            RealTimeReport parsedMessage = null;
            try {
                parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
                parsedMessage = (RealTimeReport) e.getUnfinishedMessage();
                throw e.unwrapIOException();
            } finally {
                if (parsedMessage != null) {
                    mergeFrom(parsedMessage);
                }
            }
            return this;
        }

        private int bitField0_;

        private long recordTime_;

        public long getRecordTime() {
            return recordTime_;
        }

        public Builder setRecordTime(long value) {

            recordTime_ = value;
            onChanged();
            return this;
        }

        public Builder clearRecordTime() {

            recordTime_ = 0L;
            onChanged();
            return this;
        }

        private boolean reissue_;

        public boolean getReissue() {
            return reissue_;
        }

        public Builder setReissue(boolean value) {

            reissue_ = value;
            onChanged();
            return this;
        }

        public Builder clearReissue() {

            reissue_ = false;
            onChanged();
            return this;
        }

        private VehicleState vehicleState_ = null;

        private SingleFieldBuilderV3<
                VehicleState,VehicleState.Builder,VehicleStateOrBuilder> vehicleStateBuilder_;

        public boolean hasVehicleState() {
            return vehicleStateBuilder_ != null || vehicleState_ != null;
        }

        public VehicleState getVehicleState() {
            if (vehicleStateBuilder_ == null) {
                return vehicleState_ == null ? VehicleState.getDefaultInstance() : vehicleState_;
            } else {
                return vehicleStateBuilder_.getMessage();
            }
        }

        public Builder setVehicleState(VehicleState value) {
            if (vehicleStateBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                vehicleState_ = value;
                onChanged();
            } else {
                vehicleStateBuilder_.setMessage(value);
            }

            return this;
        }

        public Builder setVehicleState(
                VehicleState.Builder builderForValue) {
            if (vehicleStateBuilder_ == null) {
                vehicleState_ = builderForValue.build();
                onChanged();
            } else {
                vehicleStateBuilder_.setMessage(builderForValue.build());
            }

            return this;
        }

        public Builder mergeVehicleState(VehicleState value) {
            if (vehicleStateBuilder_ == null) {
                if (vehicleState_ != null) {
                    vehicleState_ =
                            VehicleState.newBuilder(vehicleState_).mergeFrom(value).buildPartial();
                } else {
                    vehicleState_ = value;
                }
                onChanged();
            } else {
                vehicleStateBuilder_.mergeFrom(value);
            }

            return this;
        }

        public Builder clearVehicleState() {
            if (vehicleStateBuilder_ == null) {
                vehicleState_ = null;
                onChanged();
            } else {
                vehicleState_ = null;
                vehicleStateBuilder_ = null;
            }

            return this;
        }

        public VehicleState.Builder getVehicleStateBuilder() {

            onChanged();
            return getVehicleStateFieldBuilder().getBuilder();
        }

        public VehicleStateOrBuilder getVehicleStateOrBuilder() {
            if (vehicleStateBuilder_ != null) {
                return vehicleStateBuilder_.getMessageOrBuilder();
            } else {
                return vehicleState_ == null ?
                        VehicleState.getDefaultInstance() : vehicleState_;
            }
        }

        private SingleFieldBuilderV3<
                VehicleState,VehicleState.Builder,VehicleStateOrBuilder>
        getVehicleStateFieldBuilder() {
            if (vehicleStateBuilder_ == null) {
                vehicleStateBuilder_ = new SingleFieldBuilderV3<>(
                        getVehicleState(),
                        getParentForChildren(),
                        isClean());
                vehicleState_ = null;
            }
            return vehicleStateBuilder_;
        }

        private List<MotorState> motor_ =
                Collections.emptyList();

        private void ensureMotorIsMutable() {
            if (!((bitField0_ & 0x00000008) == 0x00000008)) {
                motor_ = new ArrayList<>(motor_);
                bitField0_ |= 0x00000008;
            }
        }

        private RepeatedFieldBuilderV3<
                MotorState,MotorState.Builder,MotorStateOrBuilder> motorBuilder_;

        public List<MotorState> getMotorList() {
            if (motorBuilder_ == null) {
                return Collections.unmodifiableList(motor_);
            } else {
                return motorBuilder_.getMessageList();
            }
        }

        public int getMotorCount() {
            if (motorBuilder_ == null) {
                return motor_.size();
            } else {
                return motorBuilder_.getCount();
            }
        }

        public MotorState getMotor(int index) {
            if (motorBuilder_ == null) {
                return motor_.get(index);
            } else {
                return motorBuilder_.getMessage(index);
            }
        }

        public Builder setMotor(
                int index, MotorState value) {
            if (motorBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureMotorIsMutable();
                motor_.set(index, value);
                onChanged();
            } else {
                motorBuilder_.setMessage(index, value);
            }
            return this;
        }

        public Builder setMotor(
                int index, MotorState.Builder builderForValue) {
            if (motorBuilder_ == null) {
                ensureMotorIsMutable();
                motor_.set(index, builderForValue.build());
                onChanged();
            } else {
                motorBuilder_.setMessage(index, builderForValue.build());
            }
            return this;
        }

        public Builder addMotor(MotorState value) {
            if (motorBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureMotorIsMutable();
                motor_.add(value);
                onChanged();
            } else {
                motorBuilder_.addMessage(value);
            }
            return this;
        }

        public Builder addMotor(
                int index, MotorState value) {
            if (motorBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureMotorIsMutable();
                motor_.add(index, value);
                onChanged();
            } else {
                motorBuilder_.addMessage(index, value);
            }
            return this;
        }

        public Builder addMotor(
                MotorState.Builder builderForValue) {
            if (motorBuilder_ == null) {
                ensureMotorIsMutable();
                motor_.add(builderForValue.build());
                onChanged();
            } else {
                motorBuilder_.addMessage(builderForValue.build());
            }
            return this;
        }

        public Builder addMotor(
                int index, MotorState.Builder builderForValue) {
            if (motorBuilder_ == null) {
                ensureMotorIsMutable();
                motor_.add(index, builderForValue.build());
                onChanged();
            } else {
                motorBuilder_.addMessage(index, builderForValue.build());
            }
            return this;
        }

        public Builder addAllMotor(
                Iterable<? extends MotorState> values) {
            if (motorBuilder_ == null) {
                ensureMotorIsMutable();
                AbstractMessageLite.Builder.addAll(
                        values, motor_);
                onChanged();
            } else {
                motorBuilder_.addAllMessages(values);
            }
            return this;
        }

        public Builder clearMotor() {
            if (motorBuilder_ == null) {
                motor_ = Collections.emptyList();
                bitField0_ = (bitField0_ & ~0x00000008);
                onChanged();
            } else {
                motorBuilder_.clear();
            }
            return this;
        }

        public Builder removeMotor(int index) {
            if (motorBuilder_ == null) {
                ensureMotorIsMutable();
                motor_.remove(index);
                onChanged();
            } else {
                motorBuilder_.remove(index);
            }
            return this;
        }

        public MotorState.Builder getMotorBuilder(
                int index) {
            return getMotorFieldBuilder().getBuilder(index);
        }

        public MotorStateOrBuilder getMotorOrBuilder(
                int index) {
            if (motorBuilder_ == null) {
                return motor_.get(index);
            } else {
                return motorBuilder_.getMessageOrBuilder(index);
            }
        }

        public List<? extends MotorStateOrBuilder>
        getMotorOrBuilderList() {
            if (motorBuilder_ != null) {
                return motorBuilder_.getMessageOrBuilderList();
            } else {
                return Collections.unmodifiableList(motor_);
            }
        }

        public MotorState.Builder addMotorBuilder() {
            return getMotorFieldBuilder().addBuilder(
                    MotorState.getDefaultInstance());
        }

        public MotorState.Builder addMotorBuilder(
                int index) {
            return getMotorFieldBuilder().addBuilder(
                    index, MotorState.getDefaultInstance());
        }

        public List<MotorState.Builder>
        getMotorBuilderList() {
            return getMotorFieldBuilder().getBuilderList();
        }

        private RepeatedFieldBuilderV3<
                MotorState,MotorState.Builder,MotorStateOrBuilder>
        getMotorFieldBuilder() {
            if (motorBuilder_ == null) {
                motorBuilder_ = new RepeatedFieldBuilderV3<>(
                        motor_,
                        ((bitField0_ & 0x00000008) == 0x00000008),
                        getParentForChildren(),
                        isClean());
                motor_ = null;
            }
            return motorBuilder_;
        }

        private FuelCell fuelCell_ = null;

        private SingleFieldBuilderV3<
                FuelCell,FuelCell.Builder,FuelCellOrBuilder> fuelCellBuilder_;

        public boolean hasFuelCell() {
            return fuelCellBuilder_ != null || fuelCell_ != null;
        }

        public FuelCell getFuelCell() {
            if (fuelCellBuilder_ == null) {
                return fuelCell_ == null ? FuelCell.getDefaultInstance() : fuelCell_;
            } else {
                return fuelCellBuilder_.getMessage();
            }
        }

        public Builder setFuelCell(FuelCell value) {
            if (fuelCellBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                fuelCell_ = value;
                onChanged();
            } else {
                fuelCellBuilder_.setMessage(value);
            }

            return this;
        }

        public Builder setFuelCell(
                FuelCell.Builder builderForValue) {
            if (fuelCellBuilder_ == null) {
                fuelCell_ = builderForValue.build();
                onChanged();
            } else {
                fuelCellBuilder_.setMessage(builderForValue.build());
            }

            return this;
        }

        public Builder mergeFuelCell(FuelCell value) {
            if (fuelCellBuilder_ == null) {
                if (fuelCell_ != null) {
                    fuelCell_ =
                            FuelCell.newBuilder(fuelCell_).mergeFrom(value).buildPartial();
                } else {
                    fuelCell_ = value;
                }
                onChanged();
            } else {
                fuelCellBuilder_.mergeFrom(value);
            }

            return this;
        }

        public Builder clearFuelCell() {
            if (fuelCellBuilder_ == null) {
                fuelCell_ = null;
                onChanged();
            } else {
                fuelCell_ = null;
                fuelCellBuilder_ = null;
            }

            return this;
        }

        public FuelCell.Builder getFuelCellBuilder() {

            onChanged();
            return getFuelCellFieldBuilder().getBuilder();
        }

        public FuelCellOrBuilder getFuelCellOrBuilder() {
            if (fuelCellBuilder_ != null) {
                return fuelCellBuilder_.getMessageOrBuilder();
            } else {
                return fuelCell_ == null ?
                        FuelCell.getDefaultInstance() : fuelCell_;
            }
        }

        private SingleFieldBuilderV3<
                FuelCell,FuelCell.Builder,FuelCellOrBuilder>
        getFuelCellFieldBuilder() {
            if (fuelCellBuilder_ == null) {
                fuelCellBuilder_ = new SingleFieldBuilderV3<>(
                        getFuelCell(),
                        getParentForChildren(),
                        isClean());
                fuelCell_ = null;
            }
            return fuelCellBuilder_;
        }

        private Engine engine_ = null;

        private SingleFieldBuilderV3<
                Engine,Engine.Builder,EngineOrBuilder> engineBuilder_;

        public boolean hasEngine() {
            return engineBuilder_ != null || engine_ != null;
        }

        public Engine getEngine() {
            if (engineBuilder_ == null) {
                return engine_ == null ? Engine.getDefaultInstance() : engine_;
            } else {
                return engineBuilder_.getMessage();
            }
        }

        public Builder setEngine(Engine value) {
            if (engineBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                engine_ = value;
                onChanged();
            } else {
                engineBuilder_.setMessage(value);
            }

            return this;
        }

        public Builder setEngine(
                Engine.Builder builderForValue) {
            if (engineBuilder_ == null) {
                engine_ = builderForValue.build();
                onChanged();
            } else {
                engineBuilder_.setMessage(builderForValue.build());
            }

            return this;
        }

        public Builder mergeEngine(Engine value) {
            if (engineBuilder_ == null) {
                if (engine_ != null) {
                    engine_ =
                            Engine.newBuilder(engine_).mergeFrom(value).buildPartial();
                } else {
                    engine_ = value;
                }
                onChanged();
            } else {
                engineBuilder_.mergeFrom(value);
            }

            return this;
        }

        public Builder clearEngine() {
            if (engineBuilder_ == null) {
                engine_ = null;
                onChanged();
            } else {
                engine_ = null;
                engineBuilder_ = null;
            }

            return this;
        }

        public Engine.Builder getEngineBuilder() {

            onChanged();
            return getEngineFieldBuilder().getBuilder();
        }

        public EngineOrBuilder getEngineOrBuilder() {
            if (engineBuilder_ != null) {
                return engineBuilder_.getMessageOrBuilder();
            } else {
                return engine_ == null ?
                        Engine.getDefaultInstance() : engine_;
            }
        }

        private SingleFieldBuilderV3<
                Engine,Engine.Builder,EngineOrBuilder>
        getEngineFieldBuilder() {
            if (engineBuilder_ == null) {
                engineBuilder_ = new SingleFieldBuilderV3<>(
                        getEngine(),
                        getParentForChildren(),
                        isClean());
                engine_ = null;
            }
            return engineBuilder_;
        }

        private VehicleLocation location_ = null;

        private SingleFieldBuilderV3<
                VehicleLocation,VehicleLocation.Builder,VehicleLocationOrBuilder> locationBuilder_ = null;

        public boolean hasLocation() {
            return locationBuilder_ != null || location_ != null;
        }

        public VehicleLocation getLocation() {
            if (locationBuilder_ == null) {
                return location_ == null ? VehicleLocation.getDefaultInstance() : location_;
            } else {
                return locationBuilder_.getMessage();
            }
        }

        public Builder setLocation(VehicleLocation value) {
            if (locationBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                location_ = value;
                onChanged();
            } else {
                locationBuilder_.setMessage(value);
            }

            return this;
        }

        public Builder setLocation(
                VehicleLocation.Builder builderForValue) {
            if (locationBuilder_ == null) {
                location_ = builderForValue.build();
                onChanged();
            } else {
                locationBuilder_.setMessage(builderForValue.build());
            }

            return this;
        }

        public Builder mergeLocation(VehicleLocation value) {
            if (locationBuilder_ == null) {
                if (location_ != null) {
                    location_ =
                            VehicleLocation.newBuilder(location_).mergeFrom(value).buildPartial();
                } else {
                    location_ = value;
                }
                onChanged();
            } else {
                locationBuilder_.mergeFrom(value);
            }

            return this;
        }

        public Builder clearLocation() {
            if (locationBuilder_ == null) {
                location_ = null;
                onChanged();
            } else {
                location_ = null;
                locationBuilder_ = null;
            }

            return this;
        }

        public VehicleLocation.Builder getLocationBuilder() {

            onChanged();
            return getLocationFieldBuilder().getBuilder();
        }

        public VehicleLocationOrBuilder getLocationOrBuilder() {
            if (locationBuilder_ != null) {
                return locationBuilder_.getMessageOrBuilder();
            } else {
                return location_ == null ?
                        VehicleLocation.getDefaultInstance() : location_;
            }
        }

        private SingleFieldBuilderV3<
                VehicleLocation,VehicleLocation.Builder,VehicleLocationOrBuilder>
        getLocationFieldBuilder() {
            if (locationBuilder_ == null) {
                locationBuilder_ = new SingleFieldBuilderV3<>(
                        getLocation(),
                        getParentForChildren(),
                        isClean());
                location_ = null;
            }
            return locationBuilder_;
        }

        private Extremum extremum_ = null;

        private SingleFieldBuilderV3<
                Extremum,Extremum.Builder,ExtremumOrBuilder> extremumBuilder_;

        public boolean hasExtremum() {
            return extremumBuilder_ != null || extremum_ != null;
        }

        public Extremum getExtremum() {
            if (extremumBuilder_ == null) {
                return extremum_ == null ? Extremum.getDefaultInstance() : extremum_;
            } else {
                return extremumBuilder_.getMessage();
            }
        }

        public Builder setExtremum(Extremum value) {
            if (extremumBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                extremum_ = value;
                onChanged();
            } else {
                extremumBuilder_.setMessage(value);
            }

            return this;
        }

        public Builder setExtremum(
                Extremum.Builder builderForValue) {
            if (extremumBuilder_ == null) {
                extremum_ = builderForValue.build();
                onChanged();
            } else {
                extremumBuilder_.setMessage(builderForValue.build());
            }

            return this;
        }

        public Builder mergeExtremum(Extremum value) {
            if (extremumBuilder_ == null) {
                if (extremum_ != null) {
                    extremum_ =
                            Extremum.newBuilder(extremum_).mergeFrom(value).buildPartial();
                } else {
                    extremum_ = value;
                }
                onChanged();
            } else {
                extremumBuilder_.mergeFrom(value);
            }

            return this;
        }

        public Builder clearExtremum() {
            if (extremumBuilder_ == null) {
                extremum_ = null;
                onChanged();
            } else {
                extremum_ = null;
                extremumBuilder_ = null;
            }

            return this;
        }

        public Extremum.Builder getExtremumBuilder() {

            onChanged();
            return getExtremumFieldBuilder().getBuilder();
        }

        public ExtremumOrBuilder getExtremumOrBuilder() {
            if (extremumBuilder_ != null) {
                return extremumBuilder_.getMessageOrBuilder();
            } else {
                return extremum_ == null ?
                        Extremum.getDefaultInstance() : extremum_;
            }
        }

        private SingleFieldBuilderV3<
                Extremum,Extremum.Builder,ExtremumOrBuilder>
        getExtremumFieldBuilder() {
            if (extremumBuilder_ == null) {
                extremumBuilder_ = new SingleFieldBuilderV3<>(
                        getExtremum(),
                        getParentForChildren(),
                        isClean());
                extremum_ = null;
            }
            return extremumBuilder_;
        }

        private Alarm alarm_ = null;

        private SingleFieldBuilderV3<
                Alarm,Alarm.Builder,AlarmOrBuilder> alarmBuilder_;

        public boolean hasAlarm() {
            return alarmBuilder_ != null || alarm_ != null;
        }

        public Alarm getAlarm() {
            if (alarmBuilder_ == null) {
                return alarm_ == null ? Alarm.getDefaultInstance() : alarm_;
            } else {
                return alarmBuilder_.getMessage();
            }
        }

        public Builder setAlarm(Alarm value) {
            if (alarmBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                alarm_ = value;
                onChanged();
            } else {
                alarmBuilder_.setMessage(value);
            }

            return this;
        }

        public Builder setAlarm(
                Alarm.Builder builderForValue) {
            if (alarmBuilder_ == null) {
                alarm_ = builderForValue.build();
                onChanged();
            } else {
                alarmBuilder_.setMessage(builderForValue.build());
            }

            return this;
        }

        public Builder mergeAlarm(Alarm value) {
            if (alarmBuilder_ == null) {
                if (alarm_ != null) {
                    alarm_ =
                            Alarm.newBuilder(alarm_).mergeFrom(value).buildPartial();
                } else {
                    alarm_ = value;
                }
                onChanged();
            } else {
                alarmBuilder_.mergeFrom(value);
            }

            return this;
        }

        public Builder clearAlarm() {
            if (alarmBuilder_ == null) {
                alarm_ = null;
                onChanged();
            } else {
                alarm_ = null;
                alarmBuilder_ = null;
            }

            return this;
        }

        public Alarm.Builder getAlarmBuilder() {

            onChanged();
            return getAlarmFieldBuilder().getBuilder();
        }

        public AlarmOrBuilder getAlarmOrBuilder() {
            if (alarmBuilder_ != null) {
                return alarmBuilder_.getMessageOrBuilder();
            } else {
                return alarm_ == null ?
                        Alarm.getDefaultInstance() : alarm_;
            }
        }

        private SingleFieldBuilderV3<
                Alarm,Alarm.Builder,AlarmOrBuilder>
        getAlarmFieldBuilder() {
            if (alarmBuilder_ == null) {
                alarmBuilder_ = new SingleFieldBuilderV3<>(
                        getAlarm(),
                        getParentForChildren(),
                        isClean());
                alarm_ = null;
            }
            return alarmBuilder_;
        }

        private List<ChargeableSubsystemElectric> chargeSystemElectric_ =
                Collections.emptyList();

        private void ensureChargeSystemElectricIsMutable() {
            if (!((bitField0_ & 0x00000200) == 0x00000200)) {
                chargeSystemElectric_ = new ArrayList<>(chargeSystemElectric_);
                bitField0_ |= 0x00000200;
            }
        }

        private RepeatedFieldBuilderV3<
                ChargeableSubsystemElectric,ChargeableSubsystemElectric.Builder,ChargeableSubsystemElectricOrBuilder> chargeSystemElectricBuilder_;

        public List<ChargeableSubsystemElectric> getChargeSystemElectricList() {
            if (chargeSystemElectricBuilder_ == null) {
                return Collections.unmodifiableList(chargeSystemElectric_);
            } else {
                return chargeSystemElectricBuilder_.getMessageList();
            }
        }

        public int getChargeSystemElectricCount() {
            if (chargeSystemElectricBuilder_ == null) {
                return chargeSystemElectric_.size();
            } else {
                return chargeSystemElectricBuilder_.getCount();
            }
        }

        public ChargeableSubsystemElectric getChargeSystemElectric(int index) {
            if (chargeSystemElectricBuilder_ == null) {
                return chargeSystemElectric_.get(index);
            } else {
                return chargeSystemElectricBuilder_.getMessage(index);
            }
        }

        public Builder setChargeSystemElectric(
                int index, ChargeableSubsystemElectric value) {
            if (chargeSystemElectricBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureChargeSystemElectricIsMutable();
                chargeSystemElectric_.set(index, value);
                onChanged();
            } else {
                chargeSystemElectricBuilder_.setMessage(index, value);
            }
            return this;
        }

        public Builder setChargeSystemElectric(
                int index, ChargeableSubsystemElectric.Builder builderForValue) {
            if (chargeSystemElectricBuilder_ == null) {
                ensureChargeSystemElectricIsMutable();
                chargeSystemElectric_.set(index, builderForValue.build());
                onChanged();
            } else {
                chargeSystemElectricBuilder_.setMessage(index, builderForValue.build());
            }
            return this;
        }

        public Builder addChargeSystemElectric(ChargeableSubsystemElectric value) {
            if (chargeSystemElectricBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureChargeSystemElectricIsMutable();
                chargeSystemElectric_.add(value);
                onChanged();
            } else {
                chargeSystemElectricBuilder_.addMessage(value);
            }
            return this;
        }

        public Builder addChargeSystemElectric(
                int index, ChargeableSubsystemElectric value) {
            if (chargeSystemElectricBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureChargeSystemElectricIsMutable();
                chargeSystemElectric_.add(index, value);
                onChanged();
            } else {
                chargeSystemElectricBuilder_.addMessage(index, value);
            }
            return this;
        }

        public Builder addChargeSystemElectric(
                ChargeableSubsystemElectric.Builder builderForValue) {
            if (chargeSystemElectricBuilder_ == null) {
                ensureChargeSystemElectricIsMutable();
                chargeSystemElectric_.add(builderForValue.build());
                onChanged();
            } else {
                chargeSystemElectricBuilder_.addMessage(builderForValue.build());
            }
            return this;
        }

        public Builder addChargeSystemElectric(
                int index, ChargeableSubsystemElectric.Builder builderForValue) {
            if (chargeSystemElectricBuilder_ == null) {
                ensureChargeSystemElectricIsMutable();
                chargeSystemElectric_.add(index, builderForValue.build());
                onChanged();
            } else {
                chargeSystemElectricBuilder_.addMessage(index, builderForValue.build());
            }
            return this;
        }

        public Builder addAllChargeSystemElectric(
                Iterable<? extends ChargeableSubsystemElectric> values) {
            if (chargeSystemElectricBuilder_ == null) {
                ensureChargeSystemElectricIsMutable();
                AbstractMessageLite.Builder.addAll(
                        values, chargeSystemElectric_);
                onChanged();
            } else {
                chargeSystemElectricBuilder_.addAllMessages(values);
            }
            return this;
        }

        public Builder clearChargeSystemElectric() {
            if (chargeSystemElectricBuilder_ == null) {
                chargeSystemElectric_ = Collections.emptyList();
                bitField0_ = (bitField0_ & ~0x00000200);
                onChanged();
            } else {
                chargeSystemElectricBuilder_.clear();
            }
            return this;
        }

        public Builder removeChargeSystemElectric(int index) {
            if (chargeSystemElectricBuilder_ == null) {
                ensureChargeSystemElectricIsMutable();
                chargeSystemElectric_.remove(index);
                onChanged();
            } else {
                chargeSystemElectricBuilder_.remove(index);
            }
            return this;
        }

        public ChargeableSubsystemElectric.Builder getChargeSystemElectricBuilder(
                int index) {
            return getChargeSystemElectricFieldBuilder().getBuilder(index);
        }

        public ChargeableSubsystemElectricOrBuilder getChargeSystemElectricOrBuilder(
                int index) {
            if (chargeSystemElectricBuilder_ == null) {
                return chargeSystemElectric_.get(index);
            } else {
                return chargeSystemElectricBuilder_.getMessageOrBuilder(index);
            }
        }

        public List<? extends ChargeableSubsystemElectricOrBuilder>
        getChargeSystemElectricOrBuilderList() {
            if (chargeSystemElectricBuilder_ != null) {
                return chargeSystemElectricBuilder_.getMessageOrBuilderList();
            } else {
                return Collections.unmodifiableList(chargeSystemElectric_);
            }
        }

        public ChargeableSubsystemElectric.Builder addChargeSystemElectricBuilder() {
            return getChargeSystemElectricFieldBuilder().addBuilder(
                    ChargeableSubsystemElectric.getDefaultInstance());
        }

        public ChargeableSubsystemElectric.Builder addChargeSystemElectricBuilder(
                int index) {
            return getChargeSystemElectricFieldBuilder().addBuilder(
                    index, ChargeableSubsystemElectric.getDefaultInstance());
        }

        public List<ChargeableSubsystemElectric.Builder>
        getChargeSystemElectricBuilderList() {
            return getChargeSystemElectricFieldBuilder().getBuilderList();
        }

        private RepeatedFieldBuilderV3<
                ChargeableSubsystemElectric,ChargeableSubsystemElectric.Builder,ChargeableSubsystemElectricOrBuilder>
        getChargeSystemElectricFieldBuilder() {
            if (chargeSystemElectricBuilder_ == null) {
                chargeSystemElectricBuilder_ = new RepeatedFieldBuilderV3<>(
                        chargeSystemElectric_,
                        ((bitField0_ & 0x00000200) == 0x00000200),
                        getParentForChildren(),
                        isClean());
                chargeSystemElectric_ = null;
            }
            return chargeSystemElectricBuilder_;
        }

        private List<ChargeableSubsystemTemperature> chargeSystemTemperature_ =
                Collections.emptyList();

        private void ensureChargeSystemTemperatureIsMutable() {
            if (!((bitField0_ & 0x00000400) == 0x00000400)) {
                chargeSystemTemperature_ = new ArrayList<>(chargeSystemTemperature_);
                bitField0_ |= 0x00000400;
            }
        }

        private RepeatedFieldBuilderV3<
                ChargeableSubsystemTemperature,ChargeableSubsystemTemperature.Builder,ChargeableSubsystemTemperatureOrBuilder> chargeSystemTemperatureBuilder_;

        public List<ChargeableSubsystemTemperature> getChargeSystemTemperatureList() {
            if (chargeSystemTemperatureBuilder_ == null) {
                return Collections.unmodifiableList(chargeSystemTemperature_);
            } else {
                return chargeSystemTemperatureBuilder_.getMessageList();
            }
        }

        public int getChargeSystemTemperatureCount() {
            if (chargeSystemTemperatureBuilder_ == null) {
                return chargeSystemTemperature_.size();
            } else {
                return chargeSystemTemperatureBuilder_.getCount();
            }
        }

        public ChargeableSubsystemTemperature getChargeSystemTemperature(int index) {
            if (chargeSystemTemperatureBuilder_ == null) {
                return chargeSystemTemperature_.get(index);
            } else {
                return chargeSystemTemperatureBuilder_.getMessage(index);
            }
        }

        public Builder setChargeSystemTemperature(
                int index, ChargeableSubsystemTemperature value) {
            if (chargeSystemTemperatureBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureChargeSystemTemperatureIsMutable();
                chargeSystemTemperature_.set(index, value);
                onChanged();
            } else {
                chargeSystemTemperatureBuilder_.setMessage(index, value);
            }
            return this;
        }

        public Builder setChargeSystemTemperature(
                int index, ChargeableSubsystemTemperature.Builder builderForValue) {
            if (chargeSystemTemperatureBuilder_ == null) {
                ensureChargeSystemTemperatureIsMutable();
                chargeSystemTemperature_.set(index, builderForValue.build());
                onChanged();
            } else {
                chargeSystemTemperatureBuilder_.setMessage(index, builderForValue.build());
            }
            return this;
        }

        public Builder addChargeSystemTemperature(ChargeableSubsystemTemperature value) {
            if (chargeSystemTemperatureBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureChargeSystemTemperatureIsMutable();
                chargeSystemTemperature_.add(value);
                onChanged();
            } else {
                chargeSystemTemperatureBuilder_.addMessage(value);
            }
            return this;
        }

        public Builder addChargeSystemTemperature(
                int index, ChargeableSubsystemTemperature value) {
            if (chargeSystemTemperatureBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureChargeSystemTemperatureIsMutable();
                chargeSystemTemperature_.add(index, value);
                onChanged();
            } else {
                chargeSystemTemperatureBuilder_.addMessage(index, value);
            }
            return this;
        }

        public Builder addChargeSystemTemperature(
                ChargeableSubsystemTemperature.Builder builderForValue) {
            if (chargeSystemTemperatureBuilder_ == null) {
                ensureChargeSystemTemperatureIsMutable();
                chargeSystemTemperature_.add(builderForValue.build());
                onChanged();
            } else {
                chargeSystemTemperatureBuilder_.addMessage(builderForValue.build());
            }
            return this;
        }

        public Builder addChargeSystemTemperature(
                int index, ChargeableSubsystemTemperature.Builder builderForValue) {
            if (chargeSystemTemperatureBuilder_ == null) {
                ensureChargeSystemTemperatureIsMutable();
                chargeSystemTemperature_.add(index, builderForValue.build());
                onChanged();
            } else {
                chargeSystemTemperatureBuilder_.addMessage(index, builderForValue.build());
            }
            return this;
        }

        public Builder addAllChargeSystemTemperature(
                Iterable<? extends ChargeableSubsystemTemperature> values) {
            if (chargeSystemTemperatureBuilder_ == null) {
                ensureChargeSystemTemperatureIsMutable();
                AbstractMessageLite.Builder.addAll(
                        values, chargeSystemTemperature_);
                onChanged();
            } else {
                chargeSystemTemperatureBuilder_.addAllMessages(values);
            }
            return this;
        }

        public Builder clearChargeSystemTemperature() {
            if (chargeSystemTemperatureBuilder_ == null) {
                chargeSystemTemperature_ = Collections.emptyList();
                bitField0_ = (bitField0_ & ~0x00000400);
                onChanged();
            } else {
                chargeSystemTemperatureBuilder_.clear();
            }
            return this;
        }

        public Builder removeChargeSystemTemperature(int index) {
            if (chargeSystemTemperatureBuilder_ == null) {
                ensureChargeSystemTemperatureIsMutable();
                chargeSystemTemperature_.remove(index);
                onChanged();
            } else {
                chargeSystemTemperatureBuilder_.remove(index);
            }
            return this;
        }

        public ChargeableSubsystemTemperature.Builder getChargeSystemTemperatureBuilder(
                int index) {
            return getChargeSystemTemperatureFieldBuilder().getBuilder(index);
        }

        public ChargeableSubsystemTemperatureOrBuilder getChargeSystemTemperatureOrBuilder(
                int index) {
            if (chargeSystemTemperatureBuilder_ == null) {
                return chargeSystemTemperature_.get(index);
            } else {
                return chargeSystemTemperatureBuilder_.getMessageOrBuilder(index);
            }
        }

        public List<? extends ChargeableSubsystemTemperatureOrBuilder>
        getChargeSystemTemperatureOrBuilderList() {
            if (chargeSystemTemperatureBuilder_ != null) {
                return chargeSystemTemperatureBuilder_.getMessageOrBuilderList();
            } else {
                return Collections.unmodifiableList(chargeSystemTemperature_);
            }
        }

        public ChargeableSubsystemTemperature.Builder addChargeSystemTemperatureBuilder() {
            return getChargeSystemTemperatureFieldBuilder().addBuilder(
                    ChargeableSubsystemTemperature.getDefaultInstance());
        }

        public ChargeableSubsystemTemperature.Builder addChargeSystemTemperatureBuilder(
                int index) {
            return getChargeSystemTemperatureFieldBuilder().addBuilder(
                    index, ChargeableSubsystemTemperature.getDefaultInstance());
        }

        public List<ChargeableSubsystemTemperature.Builder>
        getChargeSystemTemperatureBuilderList() {
            return getChargeSystemTemperatureFieldBuilder().getBuilderList();
        }

        private RepeatedFieldBuilderV3<
                ChargeableSubsystemTemperature,ChargeableSubsystemTemperature.Builder,ChargeableSubsystemTemperatureOrBuilder>
        getChargeSystemTemperatureFieldBuilder() {
            if (chargeSystemTemperatureBuilder_ == null) {
                chargeSystemTemperatureBuilder_ = new RepeatedFieldBuilderV3<>(
                        chargeSystemTemperature_,
                        ((bitField0_ & 0x00000400) == 0x00000400),
                        getParentForChildren(),
                        isClean());
                chargeSystemTemperature_ = null;
            }
            return chargeSystemTemperatureBuilder_;
        }

        public final Builder setUnknownFields(
                final UnknownFieldSet unknownFields) {
            return this;
        }

        public final Builder mergeUnknownFields(
                final UnknownFieldSet unknownFields) {
            return this;
        }


    }

    private static final RealTimeReport DEFAULT_INSTANCE;

    static {
        DEFAULT_INSTANCE = new RealTimeReport();
    }

    public static RealTimeReport getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static final Parser<RealTimeReport>
            PARSER = new AbstractParser() {
        public RealTimeReport parsePartialFrom(
                CodedInputStream input,
                ExtensionRegistryLite extensionRegistry)
                throws InvalidProtocolBufferException {
            return new RealTimeReport(input, extensionRegistry);
        }
    };

    public static Parser<RealTimeReport> parser() {
        return PARSER;
    }

    public RealTimeReport getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override
    public Parser<RealTimeReport> getParserForType() {
        return PARSER;
    }

    @Override
    public UnknownFieldSet getUnknownFields() {
        return UnknownFieldSet.getDefaultInstance();
    }

}

