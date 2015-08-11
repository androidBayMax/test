package itheima.com.test;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;/*
*/
/*//ctrl+shift+j表示删除下一个空行 有内容的是不会删除的,只会把空的地方给删除

private TextView tv;
private TextView tv1;
private TextView tv2;
private TextView tv3;
private void assignViews() {
    tv = (TextView) findViewById(R.id.tv);
    tv1 = (TextView) findViewById(R.id.tv1);
    tv2 = (TextView) findViewById(R.id.tv2); tv3 = (TextView) findViewById(R.id.tv3); } */
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main);
        super.onCreate(savedInstanceState);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        getSystemService(NOTIFICATION_SERVICE);
        return true;

    }
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
