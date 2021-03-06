package worldgo.rad.util;

import worldgo.common.R;
import worldgo.common.viewmodel.varyview.BaseVaryViewSetter;
import worldgo.common.viewmodel.varyview.anim.FadeVaryViewAnim;
import worldgo.common.viewmodel.varyview.anim.VaryViewAnimProvider;
import worldgo.common.viewmodel.varyview.anim.old.ViewAnimProvider;


public class DefaultVaryViewSetter extends BaseVaryViewSetter {
    @Override
    public String setLoadingContent() {
        return "正在加载...";
    }

    @Override
    public VaryItem setEmpty() {
        return VaryItem.Instance(R.mipmap.ic_empty_error, "找不到你想要的");
    }

    @Override
    public VaryItem setError() {
        return VaryItem.Instance(R.mipmap.ic_error_view, "出现错误");
    }

    @Override
    public int setVaryViewBackground() {
        return 0;
    }

    @Override
    public VaryViewAnimProvider setViewAnimProvider() {
        return new FadeVaryViewAnim();
    }
}
