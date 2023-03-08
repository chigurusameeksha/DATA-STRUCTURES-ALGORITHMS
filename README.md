# Lending Club Case Study
> This project aims to perform EDA to understand risky loan applicants to avoid defaults.


## Table of Contents
- [Lending Club Case Study](#lending-club-case-study)
  - [Table of Contents](#table-of-contents)
  - [General Information](#general-information)
    - [Business Context](#business-context)
    - [Problem Statement](#problem-statement)
  - [Technologies Used](#technologies-used)
  - [Conclusions](#conclusions)
  - [Contact](#contact)

<!-- You can include any other section that is pertinent to your problem -->

## General Information

### Business Context
There is a consumer finance company which specialises in lending various types of loans to1 urban customers. When the company receives a loan application, the company has to make a decision for loan approval based on the applicant’s profile. Once the application is accepted and the loan has to be sanctioned. The risk associated with that is either borrower will repay the amount in installments (both principal and interst) completely or can default leading to credit loss for the company.
### Problem Statement
Identify the risky loan applicants, so that such loans can be reduced thereby cutting down the amount of credit loss. Identification of such applicants using EDA is the aim of this case study. Also, company wants to understand the driving factors (or driver variables) behind loan default. i.e., the variables which strong indicators of default. Two types of risks are associated with the bank’s decision:</br>
1. If the applicant is likely to repay the loan, then not approving the loan results in a loss of business to the company
2. If the applicant is not likely to repay the loan, i.e. he/she is likely to default, then approving the loan may lead to a financial loss for the company

## Technologies Used
- python 3.8.16
  - numpy==1.24.2
  - pandas==1.5.3
  - matplotlib==3.7.1
  - seaborn==0.12.2

## Conclusions
- There are around 50% of properties presented in dataset which have all NULL values
- There are numerous non-essential arrtibutes or columns with predominantly NA or single values.
- Maximum defaulters are either not verified in the annual income range of $30,000 - $60,000
- Employees having service more than 10+ years have taken the Most Medium Interest rate Loans and Maximum defaulters are in Medium Interest rate i.e. between 10 to 18%.
- Applicants who could not grow professionally in terms of Annual income as compared to Work Experience peak the defaulters list

## Contact
Created by [@chigurusameeksha] and [@ankurdhuriya]


<!-- Optional -->
<!-- ## License -->
<!-- This project is open source and available under the [... License](). -->

<!-- You don't have to include all sections - just the one's relevant to your project -->