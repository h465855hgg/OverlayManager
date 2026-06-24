package io.github.h465855hgg.overlay_manager.data

import io.github.h465855hgg.overlay_manager.IRootBridge

data class BatchedUpdate(val key: String, val action: (IRootBridge) -> Unit): (IRootBridge) -> Unit {
    override fun invoke(p1: IRootBridge) {
        action(p1)
    }
}