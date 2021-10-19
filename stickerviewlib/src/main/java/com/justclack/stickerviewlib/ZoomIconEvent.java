package com.justclack.stickerviewlib;

import android.view.MotionEvent;

public class ZoomIconEvent implements StickerIconEvent {
    @Override
    public void onActionDown(StickerView stickerView, MotionEvent event) {

    }

    @Override
    public void onActionMove(StickerView stickerView, MotionEvent event) {
        stickerView.zoomAndRotateCurrentSticker(event);
    }

    @Override
    public void onActionUp(StickerView stickerView, MotionEvent event) {
        if (stickerView.getOnStickerOperationListener() != null) {
            if (stickerView.getCurrentSticker() != null) {
                stickerView.getOnStickerOperationListener()
                        .onStickerZoomFinished(stickerView.getCurrentSticker());
            }
        }
    }
}
