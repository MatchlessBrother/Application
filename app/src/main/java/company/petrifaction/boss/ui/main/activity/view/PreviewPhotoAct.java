package company.petrifaction.boss.ui.main.activity.view;

import android.view.View;
import company.petrifaction.boss.R;
import company.petrifaction.boss.base.BaseAct;
import com.github.chrisbanes.photoview.PhotoView;

public class PreviewPhotoAct extends BaseAct
{
    private PhotoView mPreviewPhotoView;
    public static final String IMG_PATH = "imgPath";

    protected int setLayoutResID()
    {
        return R.layout.activity_previewphoto;
    }

    protected void initWidgets(View rootView)
    {
        super.initWidgets(rootView);
        setTitleContent("查看图片");
        mPreviewPhotoView = (PhotoView)findViewById(R.id.previewphoto_photoview);
    }

    protected void initDatas()
    {
        if(null != getIntent().getStringExtra(IMG_PATH) && !"".equals(getIntent().getStringExtra(IMG_PATH).trim()))
            useGlideLoadImg(mPreviewPhotoView,getIntent().getStringExtra(IMG_PATH));
        else
            mPreviewPhotoView.setVisibility(View.GONE);
    }

    protected void initLogic()
    {

    }
}