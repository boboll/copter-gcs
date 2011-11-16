package com.MAVLink.Messages.common;

import com.MAVLink.Messages.IMAVLinkMessage;

public class msg_rc_channels_override extends IMAVLinkMessage{

	public msg_rc_channels_override(){ messageType = MAVLINK_MSG_ID_RC_CHANNELS_OVERRIDE; }

	public static final int MAVLINK_MSG_ID_RC_CHANNELS_OVERRIDE = 70;

	private static final long serialVersionUID = MAVLINK_MSG_ID_RC_CHANNELS_OVERRIDE;

	public int target_system; ///< System ID
	public int target_component; ///< Component ID
	public int chan1_raw; ///< RC channel 1 value, in microseconds
	public int chan2_raw; ///< RC channel 2 value, in microseconds
	public int chan3_raw; ///< RC channel 3 value, in microseconds
	public int chan4_raw; ///< RC channel 4 value, in microseconds
	public int chan5_raw; ///< RC channel 5 value, in microseconds
	public int chan6_raw; ///< RC channel 6 value, in microseconds
	public int chan7_raw; ///< RC channel 7 value, in microseconds
	public int chan8_raw; ///< RC channel 8 value, in microseconds

}