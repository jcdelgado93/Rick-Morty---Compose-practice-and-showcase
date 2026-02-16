# Rick & Morty Explorer 🛸

A modern, native Android application built with **Jetpack Compose** and **Clean Architecture** principles to demonstrate scalable development practices.

## 🎯 Project Overview

This project serves as a technical showcase of a production-ready architecture for a character exploration app consuming the [Rick and Morty API](https://rickandmortyapi.com/).

It was designed to highlight:
* **Modern UI:** 100% Jetpack Compose implementation with Material 3.
* **Performance:** Efficient state management using Coroutines & StateFlow.
* **Scalability:** Separation of concerns using MVVM and Clean Architecture layering.
* **UX Details:** Custom animations, Shimmer loading effects, and edge-to-edge immersive design.

## 🛠 Tech Stack & Libraries

* **Language:** Kotlin (100%)
* **UI Toolkit:** [Jetpack Compose](https://developer.android.com/jetpack/compose) (Material 3)
* **Architecture:** MVVM + Clean Architecture (Data / Domain / Presentation)
* **Asynchronous:** [Coroutines](https://kotlinlang.org/docs/coroutines-overview.html) & [Flow](https://kotlinlang.org/docs/flow.html)
* **Network:** [Retrofit](https://square.github.io/retrofit/) & [OkHttp](https://square.github.io/okhttp/)
* **Image Loading:** [Coil](https://coil-kt.github.io/coil/)
* **Navigation:** [Navigation Compose](https://developer.android.com/jetpack/compose/navigation)
* **Dependency Injection:** Manual Dependency Injection (Singleton Pattern) for MVP agility.

## ✨ Key Features

1.  **Immersive UI (Edge-to-Edge):** The detail screen draws behind system bars for a premium visual experience.
2.  **Reactive State Management:**
    * Uses `StateFlow` to expose UI states (`Loading`, `Success`, `Error`).
    * Prevents "white flashes" during navigation by persisting list state.
3.  **Optimized Search:** Implements a custom search logic with real-time filtering.
4.  **Polished UX:**
    * **Shimmer Effect:** Skeleton loading state instead of generic spinners.
    * **Transitions:** Slide-in/Slide-out animations between screens.
    * **Theming:** Custom "Radioactive Light" and "Deep Space Dark" themes with dynamic color disabled for brand consistency.
5.  **Smart Error Handling:** Graceful degradation when data fetching fails.

## 📂 Project Structure

```text
com.example.rickandmorty
├── data             # Repository implementation and Data Sources (API)
├── domain           # Business logic (Models and Repository Interfaces)
├── presentation     # UI Layer (Screens, ViewModels, Components, Theme)
│   ├── components   # Reusable Composables (CharacterItem, Shimmer, etc.)
│   ├── screens      # Feature screens (List, Detail)
│   └── theme        # Type, Color, and Theme definitions
└── MainActivity.kt  # Entry point and Navigation Host
