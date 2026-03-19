# ADR 001: Implementação de Observabilidade com Allure Report

## Status: ACEITO (18/03/2026)

## Contexto
A automação mobile para a Fintech necessitava de um sistema de reporte que fosse além do binário "Pass/Fail". Era necessário prover evidências visuais por passo (screenshots), métricas de tendência histórica e rastreabilidade do executor para fins de auditoria e depuração rápida.

## Decisão
Implementamos o **Allure Framework** integrado ao Cucumber 7 e Appium 2.x, utilizando as seguintes estratégias:
1. **Injeção de Metadados:** Uso de arquivos \environment.properties\ e \executor.json\ para identificar o autor (**Eduardo Sousa**) e a infraestrutura (**Android API 33**).
2. **Evidências por Passo (@Step):** Captura de tela ativa em cada interação crítica na \LoginPage\ para reduzir o tempo de diagnóstico (MTTR).
3. **Persistência de Tendência:** Estratégia de manutenção da pasta \history\ para análise de estabilidade da Sprint.

## Consequências
- **Positivas:** Transparência para stakeholders, facilidade de depuração e conformidade com auditoria bancária.
- **Negativas:** Ligeiro aumento no tamanho dos artefatos de build devido ao armazenamento de múltiplas imagens.

---
**Autor:** Eduardo Lima de Sousa - Senior SDET
**LinkedIn:** https://www.linkedin.com/in/eduardolsousa
**GitHub:** https://github.com/eduardosousa1992
