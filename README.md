# OverlayManager (Branch Maintenance Edition)

> 🇨🇳 [中文版本](./README_ch.md) | [English Version](./README.md)

This project is a maintenance fork of [zacharee/OverlayManager](https://github.com/zacharee/OverlayManager).

## About This Branch
The original repository was created in 2019, with the majority of code commits dating back to March 2019. Its dependencies, Gradle configuration, and build tools have become severely outdated and cannot be compiled directly in a modern Android Studio environment.

This branch aims to resolve these issues by:

Updating project dependencies: Upgrading all libraries and plugins to newer stable versions.

Upgrading the Gradle build system: Adjusting the Gradle Wrapper and plugin configurations to be compatible with Android Studio 2026.1.3 and above.

Preserving core functionality: No modifications have been made to any core logic or feature implementations—only necessary compatibility adaptations have been applied.

## Build Requirements
- Android Studio 2026.1.1 Patch 1 or later

- JDK 11 or later

## Acknowledgments
All original code and functionality are credited to the original author, Zachary Wander (zacharee). This fork exists solely to resolve compilation issues in modern development environments.
