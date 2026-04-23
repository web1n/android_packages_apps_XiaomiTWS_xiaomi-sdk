package com.android.bluetooth.ble.app.headset

import android.bluetooth.BluetoothDevice
import android.util.Log

@Suppress("unused")
object Spatialcontroller {
    init {
        runCatching { System.loadLibrary("spatial") }
            .onFailure { Log.e(TAG, "Failed to load spatial library", it) }
    }

    private const val TAG = "SpatialController"

    external fun createspatialhid(address: String): Boolean
    external fun destroyspatialhid(address: String): Boolean
    external fun sendspatialdata(address: String, value: FloatArray)

}
