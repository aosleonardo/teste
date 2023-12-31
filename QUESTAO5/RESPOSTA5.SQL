SELECT 
	P.NOME,
    ((SELECT SUM(B.VALOR_BENEFICIARIO) FROM BENEICIO B WHERE B.CD_BENEFICIO = P.ID_PESSOA)
      + S.SALARIO) AS REMUNERACAO
FROM PESSOA P
INNER JOIN SALARIO S ON S.ID_PESSOA = P.ID_PESSOA
WHERE S.DATA_FIM_VIGENCIA IS NULL;
