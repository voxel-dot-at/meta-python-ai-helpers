#
# work around build error where f2py fails with 'undefined symbol: cspmv_'
#
# by https://github.com/zboszor/meta-python-ai/issues/7
#
BLAS_X86_ARCH = "NEHALEM"
PACKAGECONFIG = "lapack cblas affinity dynarch"