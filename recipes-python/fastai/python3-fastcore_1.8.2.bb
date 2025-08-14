# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

SUMMARY = "Python supercharged for fastai development"
HOMEPAGE = "https://github.com/AnswerDotAI/fastcore/"
# NOTE: License in setup.py/PKGINFO is: Apache Software License 2.0
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
# NOTE: Original package / source metadata indicates license is: Apache
#
# NOTE: multiple licenses have been detected; they have been separated with &
# in the LICENSE value for now since it is a reasonable assumption that all
# of the licenses apply. If instead there is a choice between the multiple
# licenses then you should change the value to separate the licenses with |
# instead of &. If there is any doubt, check the accompanying documentation
# to determine which situation is applicable.
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

SRC_URI[sha256sum] = "8d50abd09b4d484589488dab7d78594d681de3466a84d2d1beb8b6db0d0c00b7"

inherit pypi setuptools3

# The following configs & dependencies are from setuptools extras_require.
# These dependencies are optional, hence can be controlled via PACKAGECONFIG.
# The upstream names may not correspond exactly to bitbake package names.
# The configs are might not correct, since PACKAGECONFIG does not support expressions as may used in requires.txt - they are just replaced by text.
#
# Uncomment this line to enable all the optional features.
#PACKAGECONFIG ?= "dev"
PACKAGECONFIG[dev] = ",,,python3-llms-txt python3-matplotlib python3-nbclassic python3-nbdev python3-numpy python3-pandas python3-pillow python3-plum-dispatch python3-pysymbol_llm python3-torch"

# WARNING: the following rdepends are from setuptools install_requires. These
# upstream names may not correspond exactly to bitbake package names.
RDEPENDS:${PN} += "python3-packaging"

# WARNING: the following rdepends are determined through basic analysis of the
# python sources, and might not be 100% accurate.
RDEPENDS:${PN} += "python3-asyncio python3-compression python3-core python3-datetime python3-debugger python3-html python3-io python3-ipython python3-json python3-math python3-matplotlib python3-multiprocessing python3-netclient python3-numbers python3-numpy python3-pickle python3-pillow python3-pkg-resources python3-pprint python3-shell python3-stringold"

# WARNING: We were unable to map the following python package/module
# dependencies to the bitbake packages which include them:
#    fastprogress
#    mkl
#    nbdev.showdoc
#    ujson

PYPI_PACKAGE = "fastcore"
