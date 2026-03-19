# 📱 Mobile Automation Framework - Fintech Project 🚀

> **Unified Quality Framework** desenvolvido para garantir a estabilidade, confiabilidade e observabilidade de aplicações financeiras críticas.

---

## 👨‍💻 Autor: Eduardo Lima de Sousa
**Senior QA Automation Engineer (SDET)**

[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/eduardolsousa)
[![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/eduardosousa1992)

---

## 📊 Dashboard de Observabilidade (Allure Report)

Este framework utiliza o **Allure Report** para fornecer insights executivos e técnicos em tempo real. 

![Dashboard Allure](./dashboard.png)

### 🛡️ Diferenciais de Governança Implementados:
- **Evidências Step-by-Step:** Captura automática de screenshots para cada passo do BDD.
- **Injeção de Metadados:** Rastreabilidade total de Executor, Ambiente de Teste e Versão do SO.
- **Análise de Tendência (Trend Lines):** Monitoramento de estabilidade entre execuções.
- **Categorização Inteligente:** Separação entre falhas de infraestrutura e bugs funcionais.

---

## 🏗️ Arquitetura e Decisões Técnicas

As decisões fundamentais deste projeto estão documentadas via **ADR (Architecture Decision Records)** para garantir a continuidade e o rigor técnico:

📂 [**ADR 001: Implementação de Observabilidade com Allure**](./docs/adr/ADR-001-Observabilidade-Allure.md)

---

## 🛠️ Stack Tecnológica

- **Linguagem:** Java 17
- **Engine:** Appium 2.x (UiAutomator2)
- **BDD:** Cucumber 7.x
- **Build Tool:** Maven
- **Reporting:** Allure Framework + AspectJ Weaver
- **Pattern:** Page Object Model (POM)

---

## 🚀 Como Executar

1. Certifique-se de que o **Appium Server** e o **Emulator** estão ativos.
2. Execute os testes:
   \\\powershell
   mvn test
   \\\
3. Gere e visualize o reporte:
   \\\powershell
   allure serve target/allure-results
   \\\

---
*Este projeto reflete a evolução de uma execução técnica para uma mentalidade estratégica de Engenharia de Qualidade.*
