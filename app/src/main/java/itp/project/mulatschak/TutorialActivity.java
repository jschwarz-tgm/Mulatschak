package itp.project.mulatschak;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class TutorialActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial);
        setTitle(getResources().getString(R.string.tutorial_name));

        TextView tutorialText = findViewById(R.id.textView);
        tutorialText.setText(
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Id interdum velit laoreet id donec ultrices tincidunt arcu non. Vitae semper quis lectus nulla at volutpat diam. Dolor purus non enim praesent elementum facilisis. Dui ut ornare lectus sit amet est placerat. Purus gravida quis blandit turpis cursus. Pharetra et ultrices neque ornare aenean euismod elementum nisi. Mattis pellentesque id nibh tortor id aliquet lectus proin nibh. Rhoncus mattis rhoncus urna neque viverra. Adipiscing enim eu turpis egestas pretium. Est ante in nibh mauris cursus mattis. Pharetra convallis posuere morbi leo urna molestie at. Ultrices sagittis orci a scelerisque purus. Amet risus nullam eget felis eget nunc. Fringilla phasellus faucibus scelerisque eleifend donec pretium vulputate. Pulvinar elementum integer enim neque volutpat. Ipsum faucibus vitae aliquet nec ullamcorper sit amet. Tristique nulla aliquet enim tortor at. Suspendisse faucibus interdum posuere lorem.\n" +
                        "\n" +
                        "Tempor orci dapibus ultrices in iaculis. Interdum posuere lorem ipsum dolor sit amet consectetur adipiscing. Morbi tristique senectus et netus et malesuada. Nibh sit amet commodo nulla. Duis at consectetur lorem donec massa sapien faucibus. Amet facilisis magna etiam tempor orci. Curabitur vitae nunc sed velit dignissim sodales ut eu. Tortor pretium viverra suspendisse potenti nullam ac tortor vitae purus. Massa id neque aliquam vestibulum morbi blandit. Nibh tortor id aliquet lectus proin nibh. Non curabitur gravida arcu ac tortor dignissim convallis aenean et. Faucibus nisl tincidunt eget nullam. Tristique et egestas quis ipsum suspendisse ultrices gravida dictum fusce. Urna cursus eget nunc scelerisque viverra mauris in. Integer enim neque volutpat ac tincidunt vitae. Libero justo laoreet sit amet cursus sit amet dictum sit.\n" +
                        "\n" +
                        "Cras fermentum odio eu feugiat pretium nibh ipsum consequat nisl. Fusce id velit ut tortor pretium. Dolor sed viverra ipsum nunc aliquet bibendum. Nunc lobortis mattis aliquam faucibus purus in. Dapibus ultrices in iaculis nunc sed augue lacus viverra. Quam adipiscing vitae proin sagittis nisl. Facilisis leo vel fringilla est. Nec sagittis aliquam malesuada bibendum arcu. Aliquam malesuada bibendum arcu vitae elementum curabitur. Maecenas accumsan lacus vel facilisis volutpat est velit. Vivamus arcu felis bibendum ut.\n" +
                        "\n" +
                        "Fames ac turpis egestas maecenas pharetra convallis posuere morbi leo. Malesuada nunc vel risus commodo viverra maecenas accumsan lacus. Vestibulum lectus mauris ultrices eros in cursus turpis massa. Pellentesque habitant morbi tristique senectus et netus et. Eu mi bibendum neque egestas congue quisque egestas diam. Ipsum nunc aliquet bibendum enim facilisis gravida. Purus in massa tempor nec feugiat nisl pretium fusce id. Aliquet eget sit amet tellus cras adipiscing enim eu turpis. Pretium nibh ipsum consequat nisl vel pretium. Sed viverra ipsum nunc aliquet bibendum. Lectus proin nibh nisl condimentum id venenatis a.\n" +
                        "\n" +
                        "Sagittis orci a scelerisque purus semper. Dolor purus non enim praesent. Vel facilisis volutpat est velit egestas dui id ornare. Mauris pellentesque pulvinar pellentesque habitant morbi tristique senectus et netus. Arcu cursus vitae congue mauris rhoncus aenean. Duis at tellus at urna condimentum mattis pellentesque. Dui faucibus in ornare quam viverra orci sagittis eu. Enim neque volutpat ac tincidunt vitae. Pharetra vel turpis nunc eget lorem dolor sed. Lobortis elementum nibh tellus molestie nunc non blandit massa. Magnis dis parturient montes nascetur.\n" +
                        "\n" +
                        "Integer eget aliquet nibh praesent tristique magna sit amet purus. Aenean vel elit scelerisque mauris pellentesque pulvinar pellentesque habitant. Mattis enim ut tellus elementum sagittis vitae et leo. Blandit massa enim nec dui. Sit amet nisl suscipit adipiscing bibendum est ultricies integer. Lectus magna fringilla urna porttitor rhoncus dolor purus. Tellus at urna condimentum mattis. Dictum fusce ut placerat orci nulla pellentesque dignissim. Donec et odio pellentesque diam. Non odio euismod lacinia at quis. Metus aliquam eleifend mi in nulla posuere sollicitudin aliquam ultrices. Justo donec enim diam vulputate ut pharetra sit amet aliquam. Tempor orci dapibus ultrices in iaculis nunc sed. Quis auctor elit sed vulputate mi sit amet. Sagittis purus sit amet volutpat consequat mauris nunc congue nisi.\n" +
                        "\n" +
                        "Sapien nec sagittis aliquam malesuada bibendum. Egestas sed tempus urna et pharetra pharetra. At tempor commodo ullamcorper a lacus vestibulum sed arcu. Urna nunc id cursus metus aliquam eleifend. Venenatis urna cursus eget nunc scelerisque viverra mauris in aliquam. A arcu cursus vitae congue mauris. Justo donec enim diam vulputate ut pharetra sit. Vulputate mi sit amet mauris commodo quis imperdiet massa tincidunt. Vitae et leo duis ut diam quam nulla porttitor. In dictum non consectetur a erat nam at lectus urna.\n" +
                        "\n" +
                        "Massa tempor nec feugiat nisl pretium fusce id velit. Vel pharetra vel turpis nunc eget. Massa id neque aliquam vestibulum morbi blandit cursus. Praesent tristique magna sit amet purus gravida. Ac tortor dignissim convallis aenean. Accumsan sit amet nulla facilisi morbi. Porta non pulvinar neque laoreet suspendisse interdum consectetur libero id. Elementum nisi quis eleifend quam adipiscing vitae proin sagittis. Et netus et malesuada fames ac turpis. Nunc sed velit dignissim sodales. Urna et pharetra pharetra massa. Sagittis nisl rhoncus mattis rhoncus urna. Semper risus in hendrerit gravida rutrum quisque. Ultrices mi tempus imperdiet nulla malesuada pellentesque elit eget gravida. Massa tincidunt dui ut ornare lectus sit amet est. Cras pulvinar mattis nunc sed blandit libero volutpat sed. Volutpat consequat mauris nunc congue nisi vitae suscipit tellus. Tortor at auctor urna nunc id cursus. Auctor neque vitae tempus quam pellentesque nec nam.\n" +
                        "\n" +
                        "Habitasse platea dictumst quisque sagittis purus sit amet volutpat consequat. Nullam vehicula ipsum a arcu cursus. Congue mauris rhoncus aenean vel elit scelerisque. Ut lectus arcu bibendum at varius vel pharetra vel. Faucibus pulvinar elementum integer enim neque. Eget mauris pharetra et ultrices neque ornare aenean. Nunc id cursus metus aliquam eleifend mi in nulla. Faucibus nisl tincidunt eget nullam non nisi. Tellus rutrum tellus pellentesque eu tincidunt. Malesuada nunc vel risus commodo viverra maecenas accumsan. Neque convallis a cras semper auctor neque vitae tempus quam.\n" +
                        "\n" +
                        "Sagittis vitae et leo duis. Ornare suspendisse sed nisi lacus sed viverra tellus. Tellus integer feugiat scelerisque varius morbi enim nunc faucibus. Duis at consectetur lorem donec massa. In nulla posuere sollicitudin aliquam ultrices sagittis orci a scelerisque. Eleifend donec pretium vulputate sapien nec sagittis aliquam malesuada bibendum. Et ligula ullamcorper malesuada proin libero nunc consequat interdum varius. Fermentum et sollicitudin ac orci phasellus egestas. Nunc aliquet bibendum enim facilisis. Ipsum dolor sit amet consectetur adipiscing. A erat nam at lectus."
        );

        Button tutorial = findViewById(R.id.video_button);
        tutorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), PopupTutorialVideo.class);
                startActivity(intent);
            }
        });
    }
}