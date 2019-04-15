        FirebaseInstanceId.getInstance().instanceId.addOnCompleteListener {
            if (!it.isSuccessful) {
                Log.e(TAG, "getInstanceId failed", it.exception)
                return@addOnCompleteListener
            }

            val mDeviceToken = it.result?.token ?: "BLANK"

            Log.w(TAG, "Device Token $mDeviceToken ")
        }