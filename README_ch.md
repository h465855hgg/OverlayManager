# OverlayManager (分支维护版)

🌐 **语言切换**：[English](./README.md) | [中文](./README_ch.md)

此项目是 [zacharee/OverlayManager](https://github.com/zacharee/OverlayManager) 的一个维护分支。

## 关于此分支

原仓库自 **2019** 年创建，主要代码提交停留在 **2019年3月**，其依赖项、Gradle 配置和构建工具已严重过时，无法在现代 Android Studio 环境中直接编译。

此分支旨在解决该问题，具体工作包括：

- **更新项目依赖**：将所有库和插件升级至较新稳定版本。
- **升级 Gradle 构建系统**：调整 Gradle Wrapper 和插件配置，以兼容 **Android Studio 2026.1.3** 及以上版本。
- **保持核心功能不变**：未修改任何核心逻辑和功能实现，仅做必要的兼容性适配。

## 构建要求

- Android Studio 2026.1.1 Patch 1 或更高版本
- JDK 11 或更高版本

## 致谢

所有原创代码和功能归功于原作者 [Zachary Wander (zacharee)](https://github.com/zacharee)。此分支仅为解决现代开发环境下的编译问题而存在。

---

**注意**：本分支仅关注编译可行性，不负责修复原应用可能存在的运行时问题或增加新功能。