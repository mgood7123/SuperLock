package START_OF_EMAIL.smallville7123.at.gmail.com.END_OF_EMAIL.APPS.SuperLock

import android.content.BroadcastReceiver
import android.content.Intent
import android.support.v4.content.ContextCompat.getSystemService
import android.util.Log;
import android.widget.Toast

import android.app.Activity
import android.app.Application
import android.app.KeyguardManager
import android.content.*

private const val TAG = "SUPERLOCKBROADCAST"

class Receiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        // assumes WordService is a registered service
//        val intent = Intent(context, WordService::class.java)
//        context.startService(intent)
        Log.w(TAG, "SUPERLOCK RECIEVED BROADCAST")
        StringBuilder().apply {
            append("Action: ${intent.action}\n")
            append("URI: ${intent.toUri(Intent.URI_INTENT_SCHEME)}\n")
            toString().also { log ->
                Log.d(TAG, log)
                Toast.makeText(context, log, Toast.LENGTH_LONG).show()
            }
        }
        val keyguardManager = context.getSystemService(android.app.Activity.KEYGUARD_SERVICE) as KeyguardManager
        val lock = keyguardManager.newKeyguardLock(Context.KEYGUARD_SERVICE)
        lock.disableKeyguard()
    }
}
