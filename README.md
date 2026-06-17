# CI/CD Java Maven Demo

[![Continuous Integration](../../actions/workflows/ci.yml/badge.svg)](../../actions/workflows/ci.yml)
[![Continuous Testing](../../actions/workflows/test.yml/badge.svg)](../../actions/workflows/test.yml)
[![Continuous Inspection](../../actions/workflows/inspect.yml/badge.svg)](../../actions/workflows/inspect.yml)
[![Continuous Deployment](../../actions/workflows/deploy.yml/badge.svg)](../../actions/workflows/deploy.yml)

> **Tugas Besar Manajemen Konfigurasi dan Evolusi PL**
>
> Proyek demonstrasi pipeline CI/CD menggunakan GitHub Actions dengan Java dan Maven.

## 📋 Deskripsi

Proyek ini adalah aplikasi Java sederhana yang mendemonstrasikan implementasi pipeline CI/CD lengkap menggunakan GitHub Actions. Proyek terdiri dari utility classes untuk operasi matematika dan string, dilengkapi dengan unit tests komprehensif.

## 🏗️ Struktur Proyek

```
ci-cd-java-maven/
├── .github/workflows/
│   ├── ci.yml              # Continuous Integration
│   ├── test.yml            # Continuous Testing
│   ├── inspect.yml         # Continuous Inspection
│   └── deploy.yml          # Continuous Deployment
├── src/
│   ├── main/java/com/example/calculator/
│   │   └── Calculator.java     # Operasi aritmatika dasar
│   └── test/java/com/example/calculator/
│       └── CalculatorTest.java # Unit test
├── checkstyle.xml          # Konfigurasi Checkstyle
├── pom.xml                 # Maven project configuration
└── README.md
```

## 🔄 Pipeline CI/CD

### 1. Continuous Integration (`ci.yml`)
- **Trigger:** Push & Pull Request ke `main` / `develop`
- **Fungsi:** Build dan compile source code
- **Tools:** Maven, JDK 21 (Temurin)
- **Output:** Build artifact (JAR file)

### 2. Continuous Testing (`test.yml`)
- **Trigger:** Push & Pull Request ke `main` / `develop`
- **Fungsi:** Menjalankan unit tests dan generate code coverage
- **Tools:** JUnit 5, JaCoCo
- **Output:** Test reports, Coverage report

### 3. Continuous Inspection (`inspect.yml`)
- **Trigger:** Push & Pull Request ke `main` / `develop`
- **Fungsi:** Static code analysis untuk kualitas kode
- **Tools:**
  - **Checkstyle** — Coding style (Google Java Style Guide)
  - **SpotBugs** — Deteksi potential bugs
  - **PMD** — Deteksi code smells
  - **CPD** — Deteksi duplikasi kode
- **Output:** Inspection reports (XML)

### 4. Continuous Deployment (`deploy.yml`)
- **Trigger:** Push ke `main` saja
- **Fungsi:** Generate & deploy Maven Site ke GitHub Pages
- **Output:** Website berisi:
  - 📖 Javadoc (API Documentation)
  - 📊 JaCoCo (Code Coverage Report)
  - ✨ Checkstyle Report
  - 🐛 SpotBugs Report
  - 🔍 PMD Report
  - 🧪 Surefire (Test Results)

## 🚀 Cara Menjalankan Lokal

### Prerequisites
- Java 21+
- Maven 3.9+

### Build
```bash
mvn clean compile
```

### Test
```bash
mvn clean test
```

### Code Inspection
```bash
mvn checkstyle:checkstyle spotbugs:check pmd:pmd pmd:cpd
```

### Generate Site (semua reports)
```bash
mvn clean test site
```
Reports akan tersedia di `target/site/`.

## 👥 Pembagian Tugas

| Anggota | Komponen | File Workflow |
|---------|----------|---------------|
| 1 | Continuous Integration | `ci.yml` |
| 2 | Continuous Testing | `test.yml` |
| 3 | Continuous Inspection | `inspect.yml` |
| 4 | Continuous Deployment | `deploy.yml` |
| 5 | Project Setup & Orchestration | `pom.xml`, source code |

## 📝 Setup GitHub Pages

1. Buka repository **Settings** di GitHub
2. Pilih **Pages** dari sidebar
3. Di bagian **Source**, pilih **GitHub Actions**
4. Push ke branch `main` untuk trigger deployment pertama

## 🛠️ Tech Stack

- **Bahasa:** Java 21
- **Build Tool:** Apache Maven
- **Testing:** JUnit 5
- **Coverage:** JaCoCo
- **Static Analysis:** Checkstyle, SpotBugs, PMD
- **CI/CD:** GitHub Actions
- **Deployment:** GitHub Pages
