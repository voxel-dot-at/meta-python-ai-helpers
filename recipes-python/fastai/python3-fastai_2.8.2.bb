# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

SUMMARY = "fastai simplifies training fast and accurate neural nets using modern best practices"
HOMEPAGE = "https://github.com/fastai/fastai"
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
LICENSE = "Apache & Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

SRC_URI[sha256sum] = "8b1dd2a7f20a8fb04b9aeb8677fefadcb0749654946006cc5890fc7ef59efeef"

inherit pypi setuptools3

DEPENDS = " python3-native python3-setuptools python3-setuptools-native "

# The following configs & dependencies are from setuptools extras_require.
# These dependencies are optional, hence can be controlled via PACKAGECONFIG.
# The upstream names may not correspond exactly to bitbake package names.
# The configs are might not correct, since PACKAGECONFIG does not support expressions as may used in requires.txt - they are just replaced by text.
#
# Uncomment this line to enable all the optional features.
#PACKAGECONFIG ?= "dev"
PACKAGECONFIG[dev] = ",,,python3-accelerate python3-albumentations python3-captum python3-catalyst python3-comet_ml python3-flask python3-flask_compress python3-ipykernel python3-ipywidgets python3-kornia python3-lightning python3-ninja python3-opencv-python python3-pyarrow python3-pydicom python3-pytorch-ignite python3-scikit-image python3-sentencepiece python3-tensorboard python3-timm python3-transformers python3-wandb"

# WARNING: the following rdepends are from setuptools install_requires. These
# upstream names may not correspond exactly to bitbake package names.
RDEPENDS:${PN} += "python3-cloudpickle python3-fastcore python3-fastdownload python3-fastprogress python3-fasttransform python3-matplotlib python3-packaging python3-packaging python3-pandas python3-pillow python3-pip python3-plum-dispatch python3-pyyaml python3-requests python3-scikit-learn python3-scipy python3-spacy python3-pytorch python3-torchvision python3-tomllib "

# WARNING: the following rdepends are determined through basic analysis of the
# python sources, and might not be 100% accurate.
RDEPENDS:${PN} += "python3-asyncio python3-compression python3-core python3-crypt python3-datetime python3-debugger python3-html python3-io python3-ipykernel python3-ipython python3-ipywidgets python3-json python3-math python3-matplotlib python3-multiprocessing python3-netclient python3-numbers python3-numpy python3-opencv python3-packaging python3-pickle python3-pillow python3-pyyaml python3-requests python3-shell python3-stringold"

# WARNING: We were unable to map the following python package/module
# dependencies to the bitbake packages which include them:
#    azureml.core.run
#    azureml.exceptions
#    captum.attr
#    captum.insights
#    captum.insights.attr_vis.features
#    fastcore.all
#    fastcore.parallel
#    fastprogress.fastprogress
#    nbdev.showdoc
#    pandas.api.types
#    plum
#    pydicom.dataset
#    pydicom.multival
#    pydicom.tag
#    scipy.stats
#    skimage
#    sklearn.metrics
#    sklearn.model_selection
#    spacy.symbols
#    tables
#    torch._utils
#    torch.autograd
#    torch.cuda.amp
#    torch.cuda.amp.grad_scaler
#    torch.distributions.bernoulli
#    torch.distributions.beta
#    torch.hub
#    torch.jit
#    torch.nn
#    torch.nn.functional
#    torch.nn.init
#    torch.nn.parallel
#    torch.nn.utils
#    torch.overrides
#    torch.utils.data
#    torch.utils.data._utils.collate
#    torch.utils.data.dataloader
#    torch.utils.tensorboard
#    torchvision.models
#    torchvision.models.utils
#    torchvision.transforms.functional

PYPI_PACKAGE = "fastai"
