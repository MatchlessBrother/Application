package company.petrifaction.boss.ui.main.activity.model;

import android.content.Context;
import company.petrifaction.boss.ui.base.BaseMvp_PVModel;
import company.petrifaction.boss.ui.base.BaseMvp_LocalObjCallBack;
import company.petrifaction.boss.ui.base.BaseMvp_LocalListCallBack;

public class MainModel extends BaseMvp_PVModel
{
    public void executeOfNet(Context context,int netRequestCode,BaseMvp_LocalObjCallBack localCallBack)
    {

    }

    public void executeOfLocal(Context context,int localRequestCode,BaseMvp_LocalObjCallBack localCallBack)
    {

    }

    public void executeOfNet(Context context,int netRequestCode,BaseMvp_LocalListCallBack localCallBack)
    {
        super.executeOfNet(context,netRequestCode,localCallBack);
    }

    public void executeOfLocal(Context context,int localRequestCode,BaseMvp_LocalListCallBack localCallBack)
    {
        super.executeOfLocal(context,localRequestCode,localCallBack);
    }
}