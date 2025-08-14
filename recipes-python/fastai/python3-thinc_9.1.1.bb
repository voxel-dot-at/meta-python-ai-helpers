# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

SUMMARY = "A refreshing functional take on deep learning, compatible with your favorite libraries"
HOMEPAGE = "https://github.com/explosion/thinc"
# NOTE: License in setup.py/PKGINFO is: MIT
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c1f5dbf63200fd4e2bc815cbf1e08c64"

SRC_URI[sha256sum] = "21fae2986d7777a6f050b9046dc9eab11852f1c9a997dcc9032f3ecc22784a4a"

inherit pypi setuptools3

# The following configs & dependencies are from setuptools extras_require.
# These dependencies are optional, hence can be controlled via PACKAGECONFIG.
# The upstream names may not correspond exactly to bitbake package names.
# The configs are might not correct, since PACKAGECONFIG does not support expressions as may used in requires.txt - they are just replaced by text.
#
# Uncomment this line to enable all the optional features.
#PACKAGECONFIG ?= "cuda cuda-autodetect cuda100 cuda101 cuda102 cuda110 cuda111 cuda112 cuda113 cuda114 cuda115 cuda116 cuda117 cuda11x cuda12x cuda80 cuda90 cuda91 cuda92 datasets mxnet tensorflow torch"
PACKAGECONFIG[cuda] = ",,,python3-cupy"
PACKAGECONFIG[cuda-autodetect] = ",,,python3-cupy-wheel"
PACKAGECONFIG[cuda100] = ",,,python3-cupy-cuda100"
PACKAGECONFIG[cuda101] = ",,,python3-cupy-cuda101"
PACKAGECONFIG[cuda102] = ",,,python3-cupy-cuda102"
PACKAGECONFIG[cuda110] = ",,,python3-cupy-cuda110"
PACKAGECONFIG[cuda111] = ",,,python3-cupy-cuda111"
PACKAGECONFIG[cuda112] = ",,,python3-cupy-cuda112"
PACKAGECONFIG[cuda113] = ",,,python3-cupy-cuda113"
PACKAGECONFIG[cuda114] = ",,,python3-cupy-cuda114"
PACKAGECONFIG[cuda115] = ",,,python3-cupy-cuda115"
PACKAGECONFIG[cuda116] = ",,,python3-cupy-cuda116"
PACKAGECONFIG[cuda117] = ",,,python3-cupy-cuda117"
PACKAGECONFIG[cuda11x] = ",,,python3-cupy-cuda11x"
PACKAGECONFIG[cuda12x] = ",,,python3-cupy-cuda12x"
PACKAGECONFIG[cuda80] = ",,,python3-cupy-cuda80"
PACKAGECONFIG[cuda90] = ",,,python3-cupy-cuda90"
PACKAGECONFIG[cuda91] = ",,,python3-cupy-cuda91"
PACKAGECONFIG[cuda92] = ",,,python3-cupy-cuda92"
PACKAGECONFIG[datasets] = ",,,python3-ml_datasets"
PACKAGECONFIG[mxnet] = ",,,python3-mxnet"
PACKAGECONFIG[tensorflow] = ",,,python3-tensorflow"
PACKAGECONFIG[torch] = ",,,python3-torch"

# WARNING: the following rdepends are from setuptools install_requires. These
# upstream names may not correspond exactly to bitbake package names.
RDEPENDS:${PN} += "python3-blis python3-catalogue python3-confection python3-cymem python3-murmurhash python3-numpy python3-packaging python3-preshed python3-pydantic python3-setuptools python3-srsly python3-wasabi"

# WARNING: the following rdepends are determined through basic analysis of the
# python sources, and might not be 100% accurate.
RDEPENDS:${PN} += "python3-core python3-ctypes python3-importlib-resources python3-io python3-math python3-misc python3-nbconvert python3-nbformat python3-numbers python3-numpy python3-packaging python3-pickle python3-typing-extensions"

# WARNING: We were unable to map the following python package/module
# dependencies to the bitbake packages which include them:
#    cupy.cublas
#    cupy.cuda.device
#    cupyx
#    h5py
#    hypothesis
#    hypothesis.extra.numpy
#    hypothesis.strategies
#    mock
#    mypy
#    mypy.checker
#    mypy.errorcodes
#    mypy.errors
#    mypy.nodes
#    mypy.options
#    mypy.plugin
#    mypy.subtypes
#    mypy.types
#    os_signpost
#    pathy
#    pydantic
#    pydantic.v1
#    pytest
#    tensorflow.experimental.dlpack
#    tensorflow.keras.layers
#    tensorflow.keras.models
#    thinc.backends._accelerate
#    thinc.backends.apple_ops
#    thinc.backends.cblas
#    thinc.backends.numpy_ops
#    thinc.layers.premap_ids
#    thinc.layers.sparselinear
#    thinc_bigendian_ops
#    torch.nn
#    torch.nn.functional
#    torch.utils.dlpack

PYPI_PACKAGE = "thinc"
