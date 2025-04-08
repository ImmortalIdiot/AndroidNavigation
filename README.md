# AndroidNavigation

**Navigation** is a simple Android application that demonstrates an example of implementing **modular navigation** using [Voyager](https://github.com/adrielcafe/voyager) and [Jetpack Compose](https://developer.android.com/jetpack/compose).

## 🧭 Overview

This project is a sample Android application to show how to structure and implement navigation in a **multi-module** Android application. Each feature is isolated into its own module, allowing for better scalability and separation of concerns.

## 📦 Modules

- `app` – The main entry point of the application.
- `auth` – Handles authentication flow.
- `home` – Contains the primary user experience.
- `main` – Contains the secondary user experience.
- `navigation` – Centralized navigation logic using Voyager.

## 🛠 Tech Stack

- **Kotlin**
- **Jetpack Compose** – UI toolkit for building declarative UIs.
- **Voyager** – Simple and modular navigation library for Compose.

## 🚀 Features

- Modular architecture for better code organization.
- Isolated navigation logic using Voyager's `Screen` and `Navigator`.
- Clean and scalable foundation for production apps.

## 📁 Getting Started

To build and run the project:

1. Clone the repository:
   ```bash
   git clone https://github.com/ImmortalIdiot/AndroidNavigation.git
