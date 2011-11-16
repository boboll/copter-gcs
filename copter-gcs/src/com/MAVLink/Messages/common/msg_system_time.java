package com.MAVLink.Messages.common;

import com.MAVLink.Messages.IMAVLinkMessage;

public class msg_system_time extends IMAVLinkMessage{

	public msg_system_time(){ messageType = MAVLINK_MSG_ID_SYSTEM_TIME; }

	public static final int MAVLINK_MSG_ID_SYSTEM_TIME = 2;

	private static final long serialVersionUID = MAVLINK_MSG_ID_SYSTEM_TIME;

	public long time_usec; ///< Timestamp of the master clock in microseconds since UNIX epoch.

}